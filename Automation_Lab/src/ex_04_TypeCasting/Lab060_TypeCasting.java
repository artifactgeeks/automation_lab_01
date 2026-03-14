package ex_04_TypeCasting;

public class Lab060_TypeCasting {

	public static void main(String[] args) {
		long phone = 9876543210l;
		//      short s = phone; // Implicit Narrow? not possible
		short s1 = (short)phone; // Explicit Narrow? allowed

	}

}
