import java.util.Arrays;

/**
 * Created by Alikin E.A. on 25.07.18.
 */
public class BinarySearchImpl extends StringSearch {


    BinarySearchImpl(String[] array) {
        super(array);
        sort(getArray());
    }

    @Override
    int getElementIndex(String value) {
        if (value != null) {
            return search(value, 0, getArray().length);
        } else {
            return -1;
        }
    }

    void sort(String[] array) {
        Arrays.sort(array);
    }

    private int search(String value, int startIndex, int endIndex) {

        boolean isSearchElement = getArray()[startIndex].equals(value);
        if (isSearchElement) {
            return startIndex;
        } else {
            if (endIndex - startIndex == 1) {
                return -1;
            }
        }

        int middleIndex = startIndex + ((endIndex - startIndex) / 2);
        if (getArray()[middleIndex].compareTo(value) > 0) {
            return search(value, startIndex, middleIndex);
        } else {
            return search(value, middleIndex, endIndex);
        }
    }
}
