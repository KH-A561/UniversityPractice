public class Director {
    public void constructInsertionSortSequence(SequenceBuilder builder) {
        builder.setLengthOfSubsequences(5);
        builder.generateSequence();
        builder.sortSequence();
    }

    public void constructQuickSortSequence(SequenceBuilder builder) {
        builder.setLengthOfSubsequences(6);
        builder.generateSequence();
        builder.sortSequence();
    }

    public void constructRadixSortSequence(SequenceBuilder builder) {
        builder.setLengthOfSubsequences(7);
        builder.generateSequence();
        builder.sortSequence();
    }
}
