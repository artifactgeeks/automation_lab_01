package ex_13_Functions;

public class Lab130_Simple_Method {
    static void printHello() {
        System.out.println("Hello");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        printHello(); // Output: Hello

        int sum = add(5, 3);
        System.out.println("Sum: " + sum); // Output: Sum: 8

        boolean evenCheck = isEven(9);
        System.out.println("Is 9 even? " + evenCheck); // Output: Is 9 even? false

        boolean evenCheck2 = isEven(10);
        System.out.println("Is 10 even? " + evenCheck2); // Output: Is 10 even? true
    }



}
