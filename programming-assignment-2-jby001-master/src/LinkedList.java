public class LinkedList<T> {
    private Node<T> head;
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
    public void addFirst(T value){
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

    // Add an item to the end of the LinkedList.
    public void addLast(T value) {
        if (head == null) {
            head = new Node<T>(value);
            length++;
        } else {
            length++;
            Node<T> newNode = new Node<T>(value);
            var temp = head;
            while (temp.next() != null) {
                temp = temp.next();
            }
            temp.setNext(newNode);
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

    //Remove first item in list that matches argument.
    public T remove(T value) {

        // List is empty.
        if (head == null) {
            return null;
        }

        // Value to be removed is first.
        if (head.getData() == value) {
            var temp = head;
            removeFirst();
            length--;
            return temp.getData();
        }

        // Value to be removed is not first.
        length--;
        var temp = head;
        while(temp.next().getData() != value) {
            temp = temp.next();
        }

        var removedValue = temp.next();
        temp.setNext(temp.next().next());
        return removedValue.getData();
    }


    //return true if value is in the list, false otherwise
    public boolean contains(T value){
        if(head == null) {
            return false;
        }
        var temp = head;
        while (temp.next() != null) {
            if (temp.getData().equals(value)) {
                return true;
            }
            temp = temp.next();
        }
        return false;
    }

    //loop through the list and print out all values, in order
    public void print(){
        if (head == null) {
            return;
        }

        var temp = head;
        while(temp != null) {
            System.out.println(temp.toString());
            temp = temp.next();
        }
    }

    /* Method: Adds items to the LinkedList but keeps frequently seen items near the front

    Input: a value of generic type T

    This method adds a value of generic type T to the LinkedList, as follows:
        - If value is already in the LinkedList, move it to the FRONT of the LinkedList
        - If value is NOT already in the LinkedList, create a new Node for it and add it to the END of the LinkedList

     */
    public void addFrequent(T value){
        //TODO - implement this method; you should NOT use any for loops
        Node<T> newNode = new Node<T>(value);

        // list is empty;
        if (head == null) {
            length++;
            head = newNode;
            return;
        }

        // If argument is in list already, remove duplicate and move to front.
        var temp = head;
        while(temp != null) {
            if (temp.getData().equals(value)) {
                remove(temp.getData());
                addFirst(value);
                return;
            }
            temp = temp.next();
        }

        // Argument is not in list, add to end.
        addLast(value);
    }

}
