package adapter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationAdapterTest {

    public static void main(String[] args) {

        String[] list = {"a", "b", "c", "d"};
        Vector vector = new Vector(Arrays.asList(list));

        Iterator iterator = new EnumerationAdapter(vector.elements());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
