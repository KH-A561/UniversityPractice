package ru.omsu.imit.course3.patterns.sorting;

public class QuickSort implements ISorting {

    private void swapElements(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private int partition(int[] arr, int first, int last) {
        int partitionIndex = 0;
        int pivot = arr[last];
        for (int j = first, i = first - 1; j <= last; j++) {
            if (arr[j] <= pivot) {
                i++;
                swapElements(arr, i, j);
                partitionIndex = i;
            }
        }
        return partitionIndex;
    }

    private int[] quickSort(int[] arr, int first, int last) {
        if(first < last) {
            int partitionIndex = partition(arr, first, last);
            quickSort(arr, first, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, last);
        }
        return arr;
    }

    public int[] sort(int[] unsortedArr) {
        return quickSort(unsortedArr, 0, unsortedArr.length - 1);
    }
}
