public class RadixSort implements ISorting {
    private int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public int[] sort(int arr[]) {
        int divider = 1;
        int mod = 10;
        int[] output = new int[arr.length];
        int maxDigits = String.valueOf(getMax(arr)).length();
        for (int digit = 0; digit < maxDigits; digit++) {
            int[] count = new int[10];
            for (int i = 0; i < 10; i++) {
                count[i] = 0;
            }
            for (int anArr : arr) {
                int currentDigit = (anArr % mod) / divider;
                ++count[digit];
            }
            for (int i = 1; i < 10; i++)
                count[i] = count[i] + count[i - 1];
            for (int i = arr.length - 1; i >= 0; i--) {
                int currentDigit = (arr[i] % mod) / divider;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }
            System.arraycopy(output, 0, arr, 0, arr.length);
            mod = mod * 10;
            divider = divider * 10;
        }
        return output;
    }
}
