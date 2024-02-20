public class Constructor_Implementation {
    private int value1;
    private String value2;

    public Constructor_Implementation() {
        System.out.println("Default Constructor");
        this.value1 = 0;
        this.value2 = "Default";
    }

    public Constructor_Implementation(int value1, String value2) {
        System.out.println("Parameterized Constructor 1");
        this.value1 = value1;
        this.value2 = value2;
    }

    public Constructor_Implementation(Constructor_Implementation otherObject) {
        System.out.println("Copy Constructor");
        this.value1 = otherObject.value1;
        this.value2 = otherObject.value2;
    }

    public void display() {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public static void main(String[] args) {

        Constructor_Implementation defaultObj = new Constructor_Implementation();
        defaultObj.display();

        Constructor_Implementation parameterizedObj = new Constructor_Implementation(25, "Shriyash");
        parameterizedObj.display();

        Constructor_Implementation copyObj = new Constructor_Implementation(parameterizedObj);
        copyObj.display();
    }
}
