public class SortFactory {
    public static ISorting getSortByType(String sortType) {
        switch (sortType) {
            case "Quick": {
                return new QuickSort();
            }
            case "Insertion": {
                return new InsertionSort();
            }
            case "Radix": {
                return new RadixSort();
            }
            default: {
                throw new IllegalArgumentException("There is no such sorting method");
            }
        }
    }
}
