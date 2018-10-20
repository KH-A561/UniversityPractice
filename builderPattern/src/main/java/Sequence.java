import java.util.List;

public class Sequence {
    private List<Integer[]> listOfArrays;
    private int lengthOfSubsequences;

    Sequence(List<Integer[]> listOfArrays, int lengthOfSubsequences) {
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
