/**
 * Created by Alikin E.A. on 26.07.18.
 */
public abstract class StringSearch {

    private String[] array;

    StringSearch(String[] array) {
        this.array = array;
    }

    abstract int getElementIndex(String value);

    String[] getArray() {
        return array;
    }
}
