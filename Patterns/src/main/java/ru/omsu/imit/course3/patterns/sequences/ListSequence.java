package ru.omsu.imit.course3.patterns.sequences;

import java.util.List;

public class ListSequence {
    private List<Integer[]> listOfArrays;
    private int lengthOfSubsequences;

    ListSequence(List<Integer[]> listOfArrays, int lengthOfSubsequences) {
        this.listOfArrays = listOfArrays;
        this.lengthOfSubsequences = lengthOfSubsequences;
    }

    public List<Integer[]> getListOfArrays() {
        return listOfArrays;
    }

    public int getLengthOfSubsequences() {
        return lengthOfSubsequences;
    }
}
