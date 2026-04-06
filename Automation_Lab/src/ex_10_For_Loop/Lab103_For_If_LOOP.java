package ex_10_For_Loop;

import java.util.Scanner;

// For Loop with If Condition: if age < 15 print candies age times, if age >= 15 and
//  < 18 get iPhone, age will accept at runtime and print the output accordingly add scanner to take input from the user

public class Lab103_For_If_LOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        for (int i = 1; i <= age; i++) {
            if (age < 15) {
                System.out.println("Age: " + age + " - You get hugs and " + i + " candies!");
            } else if (age >= 15 && age < 18) {
                System.out.println("Age: " + age + " - You get an iPhone!");
            } else {
                System.out.println("Age: " + age + " - You get a gift from papa!");
            }

        }
    }
}
