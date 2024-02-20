package Assignment_2.Question_5;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Using object of Rectangle =>");
        rect1.print();
        rect1.print_rect();
        System.out.println();
        
        Circle circle1 = new Circle();
        System.out.println("Using object of Circle =>");
        circle1.print();
        circle1.print_circle();
        System.out.println();
        
        Square square1 = new Square();
        System.out.println("Using object of Square =>");
        square1.print();
        square1.print_rect();
        square1.print_square();
        System.out.println();
    }
}
