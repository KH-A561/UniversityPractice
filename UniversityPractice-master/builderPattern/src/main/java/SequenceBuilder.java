import java.util.List;

public interface SequenceBuilder {
    void setLengthOfSubsequences();
    void generateSubsequence(int index);
    void sortSubsequence(int index);
    Sequence construct();
}
