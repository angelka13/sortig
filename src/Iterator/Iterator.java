package Iterator;

public interface Iterator<E> {
    public Iterator getIterator();
    public boolean hasNext();
    public boolean hasPrevious();
    public void remove();
    public E next();
    public E previous();
}
