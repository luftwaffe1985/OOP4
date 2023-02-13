package OOP4;

public class Cat extends Pet implements InterPet {

    public Cat(String name) {

        super(name);
    }

    @Override
    public void getFood(Object s) {

        System.out.printf("%s просит кушать у своего хозяина %s", this.name, s);
    }

    @Override
    public void getVoice() {

        System.out.println("Мяу");
    }

}
