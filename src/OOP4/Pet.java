package OOP4;

public abstract class Pet {

    public String name;

    public Pet(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }

    public abstract void getFood(Object s);

    public abstract void getVoice();
}
