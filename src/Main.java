public class Main {
    public static void main(String[] args) {
           int x = 50;
           int y = 10;

        System.out.println("X is " + x + " and y is " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping, x is " + x + " and y is " + y);
    }
}