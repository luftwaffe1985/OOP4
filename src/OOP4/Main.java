package OOP4;

public class Main {
    public static void main(String[] args) {
        Human<Cat> human1 = new Human<>("Дмитрий");
        Human<Dog> human2 = new Human<>("Ирина");
        Cat cat = new Cat("Дюдя");
        Dog dog = new Dog("Лорд");

        human1.call(cat);
        System.out.println();
        human2.call(dog);
        System.out.println();
        human1.game(cat);
        System.out.println();
        cat.getVoice();
        System.out.println();
        human2.game(dog);
        System.out.println();
        dog.getVoice();
        System.out.println();
        cat.getFood(human1);
        System.out.println();
        dog.getFood(human2);
        System.out.println();
    }
}
