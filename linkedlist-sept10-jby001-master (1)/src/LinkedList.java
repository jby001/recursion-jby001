public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int length;

    //creates an empty list
    public LinkedList(){
        head = null;
        length = 0;
    }

    //return the number of items currently in the linked list
    public int length(){
        return length;
    }

    //add an item to the FRONT of the linked list
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            length++;
        } else if (head.next() == null) {
            newNode.setNext(head);
            head = newNode;
            length++;
        } else {
            newNode.setNext(head);
        }

    }

    //remove the first item from the linked list
    //we return T because this is consistent with built-in Java container classes
    public T removeFirst(){
        if (head == null) {
            return null;
        } else {
            T temp = head.getData();
            head = head.next();
            length--;
            return temp;
        }
    }

    //remove last node from LinkedList
    public T removeLast() {
        if (head == null) {
            return null;
        }

        length--;

        // one item in list
        if(head.next() == null) {
            T val = head.getData();
            head = null;
            last = null;
            return val;
        }

        // more than one item in the list.
        var temp = last;
        last = last.prev();
        last.setNext(null);
        return temp.getData();

    }

    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        if(head == null) {
            return false;
        } else {
            var temp = head;
            while(temp != null) {
                if (temp.getData().equals(value)) {
                    return true;
                }
                temp = temp.next();
            }



        }
        return false;
    }

    //loop through the list and print out all values, in order
    public void print(){
        var temp = head;
        while(temp != null) {
            System.out.println(temp.toString());
            temp = temp.next();
        }

    }

    public Node<T> returnHead() {
        return head;
    }

    public Node<T> getLast() {
        return last;
    }

}
