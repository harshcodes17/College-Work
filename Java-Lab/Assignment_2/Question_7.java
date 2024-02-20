package Assignment_2;

public class Question_7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append() : " + sb);

        sb.insert(5, ",");
        System.out.println("After insert() : " + sb);

        sb.delete(5, 6);
        System.out.println("After delete() : " + sb);

        sb.reverse();
        System.out.println("After reverse() : " + sb);

        String result = sb.toString();
        System.out.println("As String: " + result);
    }
}

