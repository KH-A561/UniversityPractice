import sorting.ISorting;
import sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortBuilder implements SequenceBuilder {
    private List<Integer[]> listOfArrays;
    private int lengthOfSubsequences;

    @Override
    public void setLengthOfSubsequences(int length) {
        lengthOfSubsequences = length;
    }

    public void generateSequence() {
        Integer[] subsequence;
        listOfArrays = new ArrayList<>(lengthOfSubsequences);
        for (int i = 0; i < lengthOfSubsequences; i++) {
            listOfArrays.add(subsequence = new Integer[lengthOfSubsequences]);
            for (int j = 0; j < lengthOfSubsequences; j++) {
                subsequence[j] = Double.valueOf(Math.random() * 20).intValue();
            }
        }
    }

    public void sortSequence() {
        ISorting sortingAlgorithm = new QuickSort();
        for (int i = 0; i < lengthOfSubsequences; i++) {
            int[] subseq = Arrays.stream(listOfArrays.get(i)).mapToInt(a -> a).toArray();
            sortingAlgorithm.sort(subseq);
            Integer[] subsequence = listOfArrays.get(i);
            for (int j = 0; j < subseq.length; j++) {
                subsequence[j] = subseq[j];
            }
        }
    }

    public Sequence getResult() {
        if (listOfArrays != null && lengthOfSubsequences != 0) {
            return new Sequence(listOfArrays, lengthOfSubsequences);
        } else {
            throw new IllegalArgumentException("Parameters unset");
        }
    }
}
