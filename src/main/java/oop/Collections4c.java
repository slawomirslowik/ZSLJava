package oop;

import java.util.*;

public class Collections4c {

    static int[] tablicaLiczb = {1,2,3 };
    static List<String> lista = new ArrayList<>();
    static List<String> lista2 = Arrays.asList("ala", "ma", "kota");

//             klucz, wartość
    static Map<Integer, String> slownik = new HashMap<>();
    public static void main(String[] args) {


        slownik.put(1, "Ala");
        slownik.put(2, "ma");
        slownik.put(3, "Kota");

        for (int i = 1; i <= slownik.size() ; i++) {
            System.out.println("Element slownika: " + slownik.get(i));
        }

        slownik.put(1, "Adam");
        slownik.put(4, "As to kot Ali");

        for (int i = 1; i <= slownik.size() ; i++) {
            System.out.println("Element słownika: " + slownik.get(i));
        }
    }
}