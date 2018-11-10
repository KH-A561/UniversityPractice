package ru.omsu.imit.course3.patterns;

import ru.omsu.imit.course3.patterns.sequences.ListSequence;

public class Adapter {
    private ListSequence listSequence;

    public Adapter(ListSequence listSequence) {
        this.listSequence = listSequence;
    }

    public int[] toArray() {
        Integer[] bufArr;
        int[] result = new int[listSequence.getLengthOfSubsequences() * listSequence.getLengthOfSubsequences()];
        for (int i = 0; i < listSequence.getLengthOfSubsequences(); i++) {
            bufArr = listSequence.getListOfArrays().get(i);
            for (int j = 0; j < listSequence.getLengthOfSubsequences(); j++) {
                result[i] = bufArr[j];
            }
        }
        return result;
    }
}
