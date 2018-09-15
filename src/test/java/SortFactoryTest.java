import org.junit.Assert;
import org.junit.Test;

public class SortFactoryTest {
    @Test
    public void getSortByType() {
        int[] firstArr = {5, 8, 3, -2, 1};
        int[] secondArr = {0, 0, 0, 1, -1};
        int[] thirdArr = {-5, -25, -125, -625, -3125};

        int[] firstExpected = {-2, 1, 3, 5, 8};
        int[] actual;
        actual = SortFactory.getSortByType("Quick").sort(firstArr);
        Assert.assertArrayEquals(firstExpected, actual);
        actual = SortFactory.getSortByType("Insertion").sort(firstArr);
        Assert.assertArrayEquals(firstExpected, actual);
        actual = SortFactory.getSortByType("Radix").sort(firstArr);
        Assert.assertArrayEquals(firstExpected, actual);

        int[] secondExpected = {-1, 0, 0, 0, 1};
        actual = SortFactory.getSortByType("Quick").sort(secondArr);
        Assert.assertArrayEquals(secondExpected, actual);
        actual = SortFactory.getSortByType("Insertion").sort(secondArr);
        Assert.assertArrayEquals(secondExpected, actual);
        actual = SortFactory.getSortByType("Radix").sort(secondArr);
        Assert.assertArrayEquals(secondExpected, actual);

        int[] thirdExpected = {-3125, -625, -125, -25, -5};
        actual = SortFactory.getSortByType("Quick").sort(thirdArr);
        Assert.assertArrayEquals(thirdExpected, actual);
        actual = SortFactory.getSortByType("Insertion").sort(thirdArr);
        Assert.assertArrayEquals(thirdExpected, actual);
        actual = SortFactory.getSortByType("Radix").sort(thirdArr);
        Assert.assertArrayEquals(thirdExpected, actual);
    }
}