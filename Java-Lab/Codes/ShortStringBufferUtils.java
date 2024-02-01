public class ShortStringBufferUtils {

    // Function to create a new StringBuffer
    public static StringBuffer create(String str) {
        return new StringBuffer(str);
    }

    // Function to append a string to a StringBuffer
    public static StringBuffer append(StringBuffer buf, String str) {
        return buf.append(str);
    }

    // Function to insert a string at a specified position in a StringBuffer
    public static StringBuffer insert(StringBuffer buf, int index, String str) {
        return buf.insert(index, str);
    }

    // Function to reverse the content of a StringBuffer
    public static StringBuffer reverse(StringBuffer buf) {
        return buf.reverse();
    }

    // Function to delete a portion of a StringBuffer
    public static StringBuffer delete(StringBuffer buf, int start, int end) {
        return buf.delete(start, end);
    }

    // Function to replace a portion of a StringBuffer with another string
    public static StringBuffer replace(StringBuffer buf, int start, int end, String replacement) {
        return buf.replace(start, end, replacement);
    }

    // Function to get the length of a StringBuffer
    public static int length(StringBuffer buf) {
        return buf.length();
    }

    // Function to get the capacity of a StringBuffer
    public static int capacity(StringBuffer buf) {
        return buf.capacity();
    }

    public static void main(String[] args) {
        // Example usage of the StringBuffer functions with short names
        StringBuffer buf1 = create("Walchand");
        StringBuffer buf2 = append(buf1, " College");
        StringBuffer buf3 = insert(buf2, 5, "Boring");
        StringBuffer buf4 = reverse(buf3);
        StringBuffer buf5 = delete(buf4, 3, 9);
        StringBuffer buf6 = replace(buf5, 2, 7, "Java");

        System.out.println("Final StringBuffer: " + buf6);
        System.out.println("Length of StringBuffer: " + length(buf6));
        System.out.println("Capacity of StringBuffer: " + capacity(buf6));
    }
}
