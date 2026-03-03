package ex_01_Java_Basic;

public class Lab020_Local_Veriable_Example {
	
	
	
	 public static void main(String[] args) {
	        int a = 10;
	        {
	            int b = 10;
	            System.out.println(b);
	        }
	        int b = 90;
	        System.out.println(b);

	    }

}
