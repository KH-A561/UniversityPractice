import sorting.ISorting;
import sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortBuilder implements SequenceBuilder {
    private List<Integer[]> listOfArrays;
    private static int lengthOfSubsequences;

    public void setLengthOfSubsequences() {
        lengthOfSubsequences = Double.valueOf(Math.random() * 10 + 1).intValue();
    }

    public void generateSubsequence(int index) {
        Integer[] subsequence = new Integer[lengthOfSubsequences];
        for (int i = 0; i < lengthOfSubsequences; i++) {
            subsequence[i] = Double.valueOf(Math.random() * 20 - 20).intValue();
        }
        listOfArrays.set(index, subsequence);
    }

    public void sortSubsequence(int index) {
        ISorting sortingAlgorithm = new QuickSort();
        int[] subseq = Arrays.stream(listOfArrays.get(index)).mapToInt(a -> a).toArray();
        sortingAlgorithm.sort(subseq);
        Integer[] subsequence = listOfArrays.get(index);
        for (int i = 0; i < subseq.length; i++) {
            subsequence[i] = subseq[i];
        }
    }

    public Sequence construct() {
        setLengthOfSubsequences();
        listOfArrays = new ArrayList<>(lengthOfSubsequences);
        for (int i = 0; i < lengthOfSubsequences; i++) {
            generateSubsequence(i);
            sortSubsequence(i);
        }
        return new Sequence(listOfArrays, lengthOfSubsequences);
    }
}
