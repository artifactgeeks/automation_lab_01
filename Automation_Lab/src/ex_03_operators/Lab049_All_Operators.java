package ex_03_operators;

public class Lab049_All_Operators {

	public static void main(String[] args) {
		boolean b1 = true;
		int a = 10;
		int b = 20;
		System.out.println(a + b);  //30
		System.out.println(a > b); // false
		System.out.println(a >= b); // false
		System.out.println(a == b); // false
		System.out.println(a != b); // true

		// Arithmetic Operators
		// +,-,%,/,*

		// Relational Operators
		// > , < , >= <=, !, != , == (compare two value)

		// Logical Operators
		//  OR or and , || , && , !

		// Optional to learn - Digital Electronics
		// Bitwise Operator - Not important for Automation
		//
		// ~ - Bitwise Not,
		// >> - Right shift,
		// << Left Shift,
		// ^ - XOR

		// Compound Assignment Operators  //shorthand
		//     // +=, -=, /=, *=
		int age = 10;
		//        age /=10; // age = age /10;
		//        age +=10; // age = age +10;
		age -=10; // age = age -10;
		System.out.println(age);

		int marks=54;
		marks +=40;
		//marks=marks+40;

		System.out.println(marks);

		// ++,-- - Increment and Decrement Operator
		// Ternary Operator ?:

	}

}
