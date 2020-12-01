package Iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List intList = new ArrayList();
        intList.add(1);
        intList.add(11);
        intList.add(12);
        intList.add(13);
        intList.add(45);
        intList.add(24);
        intList.add(234);

        Container container = new Container(intList);
        Iterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List stringList = new ArrayList();
        stringList.add("Angelika");
        stringList.add("tekst");
        stringList.add("próba");


        container = new Container(stringList);
        iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
