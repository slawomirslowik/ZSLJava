package zoo;

public class Fish extends Animal {

    public Fish(String specie) {
        super(specie);
    }

    @Override
    public void move(int distance) {
        System.out.println("Jestem rybą. Pływam! Plum plum");
        super.move(distance);
    }

    @Override
    public void speak() {
        System.out.println("  ...  ");
    }
}
