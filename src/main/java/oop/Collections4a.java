package oop;

import java.util.*;

public class Collections4a {
    static List<String> lista = new ArrayList<>();
    static List<String> lista2 = Arrays.asList("ala", "ma", "kota");

    public static void main(String[] args) {
        useMap();
    }

    public static void useList() {
        for (int i = 1; i <= 10 ; i++) {
            lista.add("element" + i);
        }
        for (String l : lista) {
            System.out.println(l);
        }
        for (String l : lista2) {
            System.out.println(l);
        }
    }

    public static void useMap() {
        //    key  , value
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ala");
        map.put(2, "ma");
        map.put(3, "kota");

//        System.out.println("Element 1 z mapy: " + map.get(1));
//        System.out.println("Element 2 z mapy: " + map.get(2));

        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }

        // iteracja po wszystkich parach<klucz, wartość>  mapy
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}