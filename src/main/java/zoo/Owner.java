package zoo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.speak();

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

        for (Food food : jedzonko) {
            if (isPoison(food)) {
                System.out.println("Fuj, sam to zjedz!");
            } else {
                dog.feed(food);
            }
        }
    }

    /**
     * Check if given food is poisonous
     *
     * @param food - Food instance
     * @return True if given food is poison
     */
    private static boolean isPoison(Food food) {
        return food.foodType.equals("trutka");
    }

}