package ex_10_For_Loop;

public class solidRectangle {

    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {  // outer loop for rows
            for (int j = 1; j <= columns; j++)  {  // inner loop for columns
                System.out.print("* ");
        }
        System.out.println();
    }
    }

}

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
