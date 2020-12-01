package Iterator;

import java.util.List;

public class Container implements IteratorMaker{
    private List collection;
    @Override
    public Iterator getIterator() {
        return new IteratorImpl(collection);
    }
    public Container(List collection) {
        this.collection = collection;
    }
}
