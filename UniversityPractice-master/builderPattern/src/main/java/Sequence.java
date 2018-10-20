import java.util.List;

public class Sequence {
    private List<Integer[]> listOfArrays;
    private static int lengthOfSubsequences;

    Sequence(List<Integer[]> listOfArrays) {
        this.listOfArrays = listOfArrays;
    }

    public List<Integer[]> getListOfArrays() {
        return listOfArrays;
    }
}
