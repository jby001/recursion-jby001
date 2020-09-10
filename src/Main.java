public class Main {

    public static void main(String[] args) {
        EditDistance.printEditDistance("jake", "joder", 4,5);

        EditDistance.printEditDistance("bottle", "bottle", 6, 6);

        EditDistance.printEditDistance("whale", "what", 5, 4);
    }
}
