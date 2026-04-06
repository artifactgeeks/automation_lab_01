package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Sonal";// 0,1,2,3,4
        System.out.println(name.length()); // it will show the length of string "Sonal" 5
        System.out.println(name.charAt(3)); // it will show the char at index 3 -> a
        System.out.println(name.charAt(0)); // it will show the char at index 0 -> S
        System.out.println(name.charAt(4)); // it will show the char at index 4 -> l 

        // System.out.println(name.charAt(10)); //
        // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Patel")); // it will concatenate " Patel" to the end of "Sonal" and return a new string "Sonal Patel"

        // 3. contains()
        System.out.println(name.contains("om")); // it will check if the string "Sonal" contains the substring "om" and return false
        System.out.println(name.contains("na")); // it will check if the string "Sonal" contains the substring "na" and return true



        // 4. equals()
        System.out.println(name.equals("Sonal")); // it will check if the string "Sonal" is equal to "Sonal" and return true
        System.out.println(name.equals("sonal")); // it will check if the string "Sonal" is equal to "sonal" and return false (case-sensitive)

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); // it will check if the string "Sonal" is equal to "sonal" ignoring case and return true

        // 6. indexOf() // sonal -> ? o
        System.out.println(name.indexOf('o')); // it will return the index of the first occurrence of the character 'o' in the string "Sonal", which is 1
        System.out.println(name.indexOf('a')); // it will return the index of the first occurrence of the character 'a' in the string "Sonal", which is 3

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); // it will return the index of the first occurrence of the substring "m" in the string "madam", which is 0

        System.out.println(s1.lastIndexOf("m")); // it will return the index of the last occurrence of the substring "m" in the string "madam", which is 4

        // 7. length()
        System.out.println(name.length()); // it will return the length of the string "Sonal", which is 5

        // 8. replace( , ) // sonal
        System.out.println(name.replace('n', 'N')); // it will replace all occurrences of the character 'n' with 'N' in the string "Sonal" and return a new string "SoNal"

        // 9. split()

        String name4 = "nitisha@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]); // it will split the string "nitisha@live.com@123" at each "@" and print "nitisha"
        System.out.println(split_name4[1]); // it will split the string "nitisha@live.com@123" at each "@" and print "live.com"
        System.out.println(split_name4[2]); // it will split the string "nitisha@live.com@123" at each "@" and print "123"

        // 10. substring( , ) , sonal
        System.out.println(name.substring(1, 3)); // it will return the substring of "Sonal" from index 1 to 2, which is "on"

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase()); // it will convert "SONAL" to lowercase "sonal"

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase()); // it will convert "sonal" to uppercase "SONAL"

        // 14. startsWith()
        System.out.println(name.startsWith("S")); // it will check if the string "Sonal" starts with "S" and return true

        // 15. endsWith()
        System.out.println(name.endsWith("a")); // it will check if the string "Sonal" ends with "a" and return false

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length()); // it will return the length of the string "Niagara. O roar again!", which is 27

        String extract = anotherPalindrome.substring(11, 15); // it will return the substring of "Niagara. O roar again!" from index 11 to 14, which is "roar"
        System.out.println(extract); // it will print the extracted substring "roar"

        // Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1); // it will concatenate "Hello", "ji", and "World" to form "HellojiWorld"

        String n = "nitishaJAin";  // 0,1,2,3,4,5,6,7,8,9,10 // n.length()= 11
        System.out.println(n.indexOf("i")); // it will return the index of the first occurrence of the character 'i' in the string "nitishaJAin", which is 1
        System.out.println(n.lastIndexOf("i")); // it will return the index of the last occurrence of the character 'i' in the string "nitishaJAin", which is 9
        // because the last 'i' is at index 10, counting from 0 to 11)
        System.out.println(n.lastIndexOf("s")); // it will return the index of the last occurrence of the character 's' in the string "nitishaJAin", which is 4
    }
}


/*
n  i  t  i  s  h  a  J  A  i  n
0  1  2  3  4  5  6  7  8  9 10

1. n.indexOf("i")

👉 Finds the first occurrence of "i"
First "i" appears at index 1
✅ Output: 1

2. n.lastIndexOf("i")

👉 Finds the last occurrence of "i"
Last "i" appears at index 9
✅ Output: 9

3. n.lastIndexOf("s")

👉 Finds the last occurrence of "s"
Last "s" appears at index 4
✅ Output: 4
*/