import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by Alikin E.A. on 27.07.18.
 */
public class TestSearch {

    private static final int ARRAY_SIZE = 10_000_000;

    private List<String> listForSearch;

    @Before
    public void initTestData() {
        listForSearch = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            listForSearch.add(random.nextInt(ARRAY_SIZE) + "value");
        }
        System.out.println(Arrays.toString(listForSearch.toArray()));
    }

    @Test
    public void testBinarySearchImpl() {
        String[] array = new String[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + "value";
        }

        StringSearch search = new BinarySearchImpl(array);
        Long startTime = new Date().getTime();

        listForSearch.forEach(searchElement -> {
            int idx = search.getElementIndex(searchElement);
            String value = search.getArray()[idx];
            Assert.assertTrue(searchElement.equals(value));
        });

        System.out.println("Search end = " + (new Date().getTime() - startTime));
    }

    @Test
    public void testForEachSearchImpl() {
        String[] array = new String[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + "value";
        }

        StringSearch search = new ForEachSearchImpl(array);
        Long startTime = new Date().getTime();

        listForSearch.forEach(searchElement -> {
            int idx = search.getElementIndex(searchElement);
            String value = search.getArray()[idx];
            Assert.assertTrue(searchElement.equals(value));
        });

        System.out.println("Search end = " + (new Date().getTime() - startTime));
    }
}
