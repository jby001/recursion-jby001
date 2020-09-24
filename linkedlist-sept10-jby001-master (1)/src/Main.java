import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        var c = new LinkedList<String>();
        c.add("A");
        c.add("B");
        c.add("C");
        ListIterator<String> itr = c.listIterator();
        itr.next();
        itr.next();
        itr.previous();
        itr.remove();
        itr.add("D");
        itr.next();
        System.out.println(c);

    }

    public static <T> boolean search(Node<T> head, T x) {
        if (head == null) {
            return false;
        }

        if (head.getData().equals(x)) {
            return true;
        }

        return search(head.next(), x);
    }
}
