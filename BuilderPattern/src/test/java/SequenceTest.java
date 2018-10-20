import org.junit.Test;
import sorting.ISorting;
import sorting.RadixSort;

import static org.junit.Assert.assertEquals;

public class SequenceTest {
    @Test
    public void clientApplication() {
        Director director = new Director();
        SequenceBuilder insertionBuilder = new InsertionSortBuilder();
        SequenceBuilder radixBuilder = new RadixSortBuilder();
        SequenceBuilder quickBuilder = new QuickSortBuilder();
        Sequence sequence;

        director.constructInsertionSortSequence(insertionBuilder);
        sequence = insertionBuilder.getResult();
        for (Integer[] subseq : sequence.getListOfArrays()) {
            for (int i = 0; i < subseq.length - 1; i++) {
                assertEquals(true, subseq[i] <= subseq[i + 1]);
            }
        }

        director.constructRadixSortSequence(radixBuilder);
        sequence = radixBuilder.getResult();
        for (Integer[] subseq : sequence.getListOfArrays()) {
            for (int i = 0; i < subseq.length - 1; i++) {
                assertEquals(true, subseq[i] <= subseq[i + 1]);
            }
        }

        director.constructQuickSortSequence(quickBuilder);
        sequence = quickBuilder.getResult();
        for (Integer[] subseq : sequence.getListOfArrays()) {
            for (int i = 0; i < subseq.length - 1; i++) {
                assertEquals(true, subseq[i] <= subseq[i + 1]);
            }
        }
    }


}