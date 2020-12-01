package Iterator;

import java.util.List;

public class IteratorImpl<E> implements Iterator {
    private List<E> collection;
    private int position = 0;
    public IteratorImpl(List<E> collection) {
        this.collection = collection;
    }
    public IteratorImpl() {
    }

    @Override
    public Iterator getIterator() {
        return new IteratorImpl<E>();
    }
    @Override
    public boolean hasNext() {
        if(position >= collection.size() || collection.get(position) == null)
            return false;
        else
            return true;
    }
    @Override
    public boolean hasPrevious() {
        if(position < 0 || collection.get(position) == null)
            return false;
        else
            return true;
    }
    @Override
    public E next() {
        E item = collection.get(position);
        position++;
        return item;
    }
    @Override
    public E previous() {
        E item = collection.get(position);
        position--;
        return item;
    }
    @Override
    public void remove() {
        if(position >= 0 && collection.get(position) != null)
            collection.remove(position);
    }
}
