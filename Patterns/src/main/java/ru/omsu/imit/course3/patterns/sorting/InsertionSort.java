package ru.omsu.imit.course3.patterns.sorting;

public class InsertionSort implements ISorting {

    public int[] sort(int[] unsortedArr) {
        for (int i = 1; i < unsortedArr.length; i++) {
            int key = unsortedArr[i];
            int j = i - 1;
            while (j >= 0 && unsortedArr[j] > key) {
                unsortedArr[j + 1] = unsortedArr[j];
                j -= 1;
            }
            unsortedArr[j + 1] = key;
        }
        return unsortedArr;
    }
}
