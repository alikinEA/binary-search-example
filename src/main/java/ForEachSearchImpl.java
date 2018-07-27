/**
 * Created by Alikin E.A. on 26.07.18.
 */
public class ForEachSearchImpl extends StringSearch {

    ForEachSearchImpl(String[] array) {
        super(array);
    }

    @Override
    int getElementIndex(String value) {
        int result = -1;
        int index = 0;
        for (String element : getArray()) {
            if (value.equals(element)) {
                result = index;
                break;
            }
            index++;
        }
        return result;
    }
}
