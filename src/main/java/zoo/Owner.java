package zoo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public static void main(String[] args) {
        Animal nemo = new Fish("błazenek");

        nemo.setSpeed(20);
        nemo.move(10);

        Animal polly = new Bird("papuga");
        polly.setSpeed(20);
        polly.move(10);

    }

    private void playWithAnimal() {
        Animal dog = new Animal("dog");

        dog.move(10);
        dog.setSpeed(5);
        dog.move(1000);

        Animal polly = new Bird("papuga");
        polly.setSpeed(100);
        polly.move(1000);

    }

    private static void feedAnimal(Animal animal) {
        animal.speak();

        Food paroowa = new Food("parówka", 50000);
        Food trutka = new Food("trutka", 50000);
        Food marchewa = new Food("marchewka", 10000);
        Food smaczek = new Food("smaczek", 5000);

        List<Food> jedzonko = new ArrayList<>();

        jedzonko.add(paroowa);
        jedzonko.add(trutka);
        jedzonko.add(marchewa);
        jedzonko.add(smaczek);

        // streamy  ->                     lambdy
//        jedzonko.stream().forEach(s -> dog.feed(s));

        animal.feed(jedzonko);
    }



}