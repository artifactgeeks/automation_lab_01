package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        // Stored in String Constant Pool (SCP)
        // Only one object is created for "Hello"
        // Both s1 and s4 point to same memory

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");

        // Created using new → stored in Heap (Object Area)
        // Each new creates a new object
        // So s2 and s3 are different objects

        String s5 = new String("hello"); // OA = 3
        // Another object in Heap (different case "hello")

        // == -> Comparsion -> String -> this check the locations ref.

        System.out.println(s1 == s3); // false -> s1 is in SCP and s3 is in Heap
        System.out.println(s1 == s2); // false -> s1 is in SCP and s2 is in Heap
        System.out.println(s2 == s3); // false -> s2 and s3 are different objects in Heap

        System.out.println(s1 == s4); // true -> s1 and s4 both point to same object in SCP
        System.out.println(s3 == s5); // false -> s3 and s5 are different objects in Heap

        // equals ( content) -> value

        System.out.println(s1.equals(s2)); // true -> s1 and s2 have same content "Hello"
        System.out.println(s1.equals(s3)); // true -> s1 and s3 have same content "Hello"
        System.out.println(s3.equals(s5)); // false -> s3 has "Hello" and s5 has "hello" (case-sensitive)
        
        
        System.out.println(s3.equalsIgnoreCase(s5)); // true -> equalsIgnoreCase ignores case, so "Hello" and "hello" are considered equal

    }

}
