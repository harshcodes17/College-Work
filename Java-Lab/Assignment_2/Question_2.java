package Assignment_2;

public class Question_2 {
    public static void main(String[] args) {
        String temp1 = "Harsh";
        System.out.println("Length of String is : "+temp1.length());
        System.out.println("To check whether string is empty or not : "+temp1.isEmpty());
        System.out.println("Character at index '0' is : "+temp1.charAt(0));
        System.out.println("Substring from index 0 to 4 is : "+temp1.substring(0, 4));
        System.out.println("To check whether string conatins sequence of characters : "+temp1.contains("yash"));
        System.out.println("To check whether string ends with given character : "+temp1.endsWith("h"));
        System.out.println("To get first occurence of char in string : "+temp1.indexOf("s"));

        String name = temp1.concat(" Bamane");
        System.out.println("String after concatenation is : "+name);

        String temp2 = "TO_LOWER";
        System.out.println("String after using toLowerCase() : "+temp2.toLowerCase());

        String temp3 = "TO_UPPER";
        System.out.println("String after using toUpperCase() : "+temp3.toUpperCase());

        String temp4 = "abcabcabc";
        System.out.println("To replace a char with specified value : "+temp4.replace("a", "d"));

    }
}
