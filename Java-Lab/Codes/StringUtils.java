public class StringUtils {

    // Function to find the length of a string
    public static int len(String s) {
        return s.length();
    }

    // Function to concatenate two strings
    public static String concat(String s1, String s2) {
        return s1 + s2;
    }

    // Function to compare two strings
    public static int compare(String a, String b) {
        return a.compareTo(b);
    }

    // Function to check if a string contains another string
    public static boolean contains(String main, String sub) {
        return main.contains(sub);
    }

    // Function to convert a string to lowercase
    public static String toLowerCase(String original) {
        return original.toLowerCase();
    }

    // Function to convert a string to uppercase
    public static String toUpperCase(String original) {
        return original.toUpperCase();
    }

    // Function to trim leading and trailing whitespaces from a string
    public static String trim(String input) {
        return input.trim();
    }

    // Function to check if two strings are equal (ignoring case)
    public static boolean equalsIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    // Function to get a substring of a string
    public static String substring(String s, int start, int end) {
        return s.substring(start, end);
    }

    public static void main(String[] args) {
        // Example usage of the functions with short variable names
        String s1 = "Harsh";
        String s2 = "Bamane";

        System.out.println("Length: " + len(s1));
        System.out.println("Concatenation: " + concat(s1, s2));
        System.out.println("Comparison: " + compare(s1, s2));
        System.out.println("Contains: " + contains(s1, "ell"));
        System.out.println("To Lowercase: " + toLowerCase(s1));
        System.out.println("To Uppercase: " + toUpperCase(s1));
        System.out.println("Trim: " + trim("   Hello   "));
        System.out.println("Equals Ignore Case: " + equalsIgnoreCase(s1, "hello"));
        System.out.println("Substring: " + substring(s1, 1, 4));
    }
}
