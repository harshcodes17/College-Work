package Assignment_2;

public class Question_3 {
    public static void main(String[] args) {
        StringBuffer temp1 = new StringBuffer("Shriyash ");
        temp1.append("Dongarkar");
        System.out.println("After using append() : "+temp1);

        StringBuffer temp2 = new StringBuffer("Hello ");
        temp2.insert(5, "World");
        System.out.println("After using insert() : "+temp2);

        StringBuffer temp3 = new StringBuffer("Hello");
        temp3.replace(1, 4, "World");
        System.out.println("After using replace() : "+temp3);

        StringBuffer temp4 = new StringBuffer("Javascript");
        temp4.delete(4, temp4.length());
        System.out.println("After using delete() : "+temp4);

        StringBuffer temp5 = new StringBuffer("Walchand");
        temp5.reverse();
        System.out.println("After using reverse() : "+temp5);

        StringBuffer temp6 = new StringBuffer();
        System.out.println("Capacity by default : "+temp6.capacity());
        temp6.append("Java is an Object-Oriented Programming Language");
        System.out.println("After appending : "+temp6.capacity());
    }
}
