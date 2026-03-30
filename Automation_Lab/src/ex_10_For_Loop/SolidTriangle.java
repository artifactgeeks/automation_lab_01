package ex_10_For_Loop;

/*
* 
* *
* * *
* * * *
* * * * *
*/

public class SolidTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}