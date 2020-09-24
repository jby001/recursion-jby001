public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T x){
        this(x,null);
    }

    public Node(T x, Node<T> n){
        data = x;
        next = n;
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

    public void setNext(Node<T> n){
        next = n;
    }

    public String toString(){
        return "Node value: " + data;
    }

}
