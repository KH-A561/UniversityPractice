import java.util.List;

public interface SequenceBuilder {
    void setLengthOfSubsequences(int length);
    void generateSequence();
    void sortSequence();
    Sequence getResult();
}

