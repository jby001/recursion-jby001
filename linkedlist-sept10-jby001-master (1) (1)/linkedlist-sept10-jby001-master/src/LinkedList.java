import java.util.Iterator;
import java.util.List;

public class LinkedList<T> {
    private Node<T> head;
    private int length;

    //creates an empty list
    public LinkedList(){
        head = null;
        length = 0;
    }

    // Return Iterator instance
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

    //return the number of items currently in the linked list
    public int length(){
        return length;
    }

    //add an item to the FRONT of the linked list
    public void addFirst(T value) {
        if (head == null) {
            head = new Node<T>(value);
            length++;
        } else {
            Node<T> newNode = new Node<>(value);
            newNode.setNext(head);
            head = newNode;
            length++;
        }

    }

    //remove the first item from the linked list
    //we return T because this is consistent with built-in Java container classes
    public T removeFirst(){
        if (head == null) {
            return null;
        }

        T temp = head.getData();
        head = head.next();
        length--;
        return temp;
    }

    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        if(head == null) {
            return false;
        }
        var temp = head;
        for(int i = 0; i < length; i++) {
            if (temp.getData() == value) {
                return true;
            } else {
                temp = temp.next();
            }
        }
        return false;
    }

    //loop through the list and print out all values, in order
    public void print(){
        if (head == null) {
            return;
        }

        var temp = head;
        for(int i = 0; i < length; i++) {
            System.out.println(temp.getData());
            temp = temp.next();
        }

    }

    public Node<T> returnHead() {
        return head;
    }

}
