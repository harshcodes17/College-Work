package Assignment_2.Question_10;

public class Main {
    public static void main(String[] args) {
        LivingBeing living_obj = new LivingBeing();
        Human human_obj = new Human();
        Animal animal_obj = new Animal();
        Dog dog_obj = new Dog();
        Student student_obj = new Student();

        System.out.println("Methods accessible using LivingBeing Object => ");
        living_obj.breathe();

        System.out.println("Methods accessible using Human Object => ");
        human_obj.breathe();
        human_obj.speak();

        System.out.println("Methods accessible using Animal Object => ");
        animal_obj.breathe();
        animal_obj.sound();

        System.out.println("Methods accessibe using Student Object => ");
        student_obj.breathe();
        student_obj.speak();
        student_obj.study();

        System.out.println("Methods accessible using Dog Object => ");
        dog_obj.bark();
        dog_obj.sound();
        dog_obj.bark();
        
    }
}
