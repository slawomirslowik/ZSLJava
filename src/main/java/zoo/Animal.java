package zoo;

import java.util.List;

public class Animal {
    String specie;
    char gender;
    int age;
    boolean isAlive = true;
    boolean isHungry = true;
    int caloriestTofull;
    long duzaLiczba;
    float liczbaZmiennoprzecinkowa;
    double liczbaZmiennoprzecinkowaZDwomaMiejscamiPoPrzecinku;
    long caloriesCounter = 0L;
    int speed = 0;

    public Animal(String specie) {
        this.specie = specie;
    }

    //setter for speed field
    // skrót: alt+ insert > setter > wybieramy pole (zmienną)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(int distance) {
        if (speed == 0) {



            System.out.println("Leżę i nigdzie się nie ruszam.");
        } else {
            double timeToReach = (double) distance / speed;
            System.out.println("Poruszam się z prędkością: ["
            + speed +" m/s]. Za: [" + timeToReach + "] sekund dotrę do celu.");
        }
    }

    public void speak() {
        System.out.println("My name is " + specie);
    }

    // alt + inster -> dodaje konctruktor

    public void feed(String food) {
        System.out.println(food);
    }

    public void feed(String food, int amount) {
        System.out.println(food + amount);
    }

    // sout  - > skrót do System
    public void feed(Food food) {
//        if (food.foodType.equals("trutka")) {
//            System.out.println("Zeżarłem trutkę. Umieram sobie.");
//            isAlive = false;
//        }

        /*
         ! - operator negacji - odwraca zmienną logiczną
        */

        if (!isAlive) {
            System.out.println("Leże i nie żyje.");
        } else {
            System.out.println("Jem sobie : "
                    + food.foodType + " która ma " + food.calories + " kalorii.");
            caloriesCounter += food.calories;
            System.out.println("Dziś zjadłem " + caloriesCounter + " kalorii.");
        }
    }

    public void feed(List<Food> foods) {
        for (Food f : foods) {
            if (isPoison(f)) {
                System.out.println("Fuj, sam to zjedz!");
            } else {
                feed(f);
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