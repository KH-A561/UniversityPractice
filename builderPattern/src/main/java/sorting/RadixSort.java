package sorting;

import java.util.Arrays;

public class RadixSort implements ISorting {
    public int[] sort(int[] unsortedArr) {
        for (int place = 1; place <= 1000000000; place *= 10) {
            unsortedArr = countingSort(unsortedArr, place);
        }
        return unsortedArr;
    }

    private static int[] countingSort(int[] input, int place) {
        int[] out = new int[input.length];

        int[] count = new int[10];

        for (int i = 0; i < input.length; i++) {
            int digit = getDigit(input[i], place);
            count[digit] += 1;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = input.length - 1; i >= 0; i--) {
            int digit = getDigit(input[i], place);

            out[count[digit] - 1] = input[i];
            count[digit]--;
        }

        return out;

    }

    private static int getDigit(int value, int digitPlace) {
        return ((value / digitPlace) % 10);
    }
}