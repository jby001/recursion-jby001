public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.addFirst(i);
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(100));


        System.out.println(search(list.returnHead(), 8));

        list.print();
    }

    public static <T> boolean search(Node<T> head, T x) {
        if (head == null) {
            return false;
        }

        if (head.getData() == x) {
            return true;
        }

        return search(head.next(), x);
    }
}
