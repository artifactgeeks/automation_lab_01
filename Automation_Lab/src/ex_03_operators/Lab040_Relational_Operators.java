package ex_03_operators;

public class Lab040_Relational_Operators {

	public static void main(String[] args) {
		// < Less Than
		// < =  -> Less than or equal to
		// > Greater
		// > = Greater or equal
		// == ->  Equal to (but checking)
		// != -> Not equal

		// All of them will result boolean output.

		int a = 10;
		int b = 30;
		boolean c = a > b; // 10 >30
		System.out.println(c);

		int age_rahul=35;
		int age_karan=36;
		boolean result=age_karan >= age_rahul;
		System.out.println(result);

		boolean compare = age_karan == age_rahul;
		System.out.println("comapre" + compare);
		// age_karan > age_rahul or age_karan = age_rahul
		// true                  or   false


	}

}
