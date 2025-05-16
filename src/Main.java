import model.Cat;
import model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
        Person person = new Person("Vasya", 15);
        System.out.println(person);
        Cat cat1 = new Cat("Barsik");
        System.out.println(cat1);
    }
}
