import model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
        Person person1 = new Person("Vasya", 15);
        System.out.println(person1);
        Person person2 = new Person("Olya", 20);
        System.out.println(person2);
    }
}
