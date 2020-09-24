import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {

    private Node<T> current;

    public ListIterator(LinkedList<T> list) {
        this.current = list.returnHead();
    }

    @Override
    public boolean hasNext() {
        return current != null && current.next() != null;
    }

    @Override
    public T next() {
        if (current == null) {
            return null;
        }

        return current.next().getData();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }
}
