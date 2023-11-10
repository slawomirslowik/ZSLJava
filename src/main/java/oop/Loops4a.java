package oop;

public class Loops4a {

    int liczba = 2;

    // tablica / array

    //psvm
    public static void main(String[] args) {
        //deklaruję tablicę liczb
        int[] tablicaLiczb;

        //inicjalizuję tablicę o rozmiarze '3'
        tablicaLiczb = new int[3];

        // indeksy pól: [  0  ,   1  ,  2  ]
        //               [  .  ,   .  ,  .  ]

        //''wkładanie' obiektów do tablicy

        tablicaLiczb[0] = 10;
        tablicaLiczb[1] = 20;
        tablicaLiczb[2] = 30;

// pętla for (each)
//        for (int number : tablicaLiczb) {
//            System.out.println("Liczba : " + number);
//        }

// pętla for klasyczna:
//  dla każdego (inicjalizacja; weryfikacja ; aktualizacja)
        for (int i = 0; i < 3; i++) {
            System.out.println("Liczba : " + tablicaLiczb[i]);
            tablicaLiczb[i]++;
        }
        // i++   ->    i = i + 1;

//            for (int i = 0; i < 10; i++) {
//                System.out.println("counter: " + i);
//            }


// dopóki (warunek jest prawdziwy ) {
//      wykonuj kod;
// }
        int i = 1;
        while (i < 10) {
//                System.out.println(++i);
            System.out.println(i++);
            if (i == 5) System.out.println("jestem w połowie");
        }


        do {
            System.out.println("do while");
        }
        while (false);
    }
}