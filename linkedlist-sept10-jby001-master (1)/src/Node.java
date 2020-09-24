public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    public Node(T x){
        this(x,null, null);
    }

    public Node(T x, Node<T> n, Node<T> p){
        data = x;
        next = n;
        prev = p;
    }

    public T getData(){
        return data;
    }

    public void setData(T d){
        data = d;
    }

    public Node<T> next(){
        return next;
    }

    public Node<T> prev() { return prev;}

    public void setNext(Node<T> n){
        this.next = n;
    }

    public void setPrev(Node<T> p) { this.prev = p;}

    public String toString(){
        return "Node value: " + data;
    }




}
