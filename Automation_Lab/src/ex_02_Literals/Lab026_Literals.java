package ex_02_Literals;

public class Lab026_Literals {

	public static void main(String[] args) {
		int age = 65; // 65

		// Binary Literal
		int binary_num = 0b1010; // Decimal System - 10
		System.out.println(binary_num);

		// Octal base? -> 8
		int octal = 0101;
		System.out.println(octal);		

		//		1 × 8⁰ = 1 × 1   = 1
		//		0 × 8¹ = 0 × 8   = 0
		//		1 × 8² = 1 × 64  = 64
		//		0 × 8³ = 0 × 512 = 0
		//		64+1=65

		// Hexadecimal Literals - 16
		int hex = 0Xface;
		//base 16 color combination are in hex - #28a745
		System.out.println(hex);	

	}

}
