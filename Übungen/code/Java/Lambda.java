package Übungen.code.Java;

import java.util.List;

public class Lambda {

        public static void main(String[] args) {

        // === Aufgabe 1: Verwende map, um die Länge von Strings zu berechnen ===
        // Du hast eine Liste von Namen. Verwende map(), um die Länge jedes Namens zu berechnen.
        List<String> namen = List.of("Anna", "Ben", "Charlotte", "Daniel");

        // Für jeden Namen in der Liste von Namen, mache folgendes: Mappe den Namen auf die Länge des Namens
        List<Integer> laengen = namen.stream()
            .map(name -> name.length())
            .toList();

        System.out.println(laengen); // Ausgabe: [4, 3, 9, 6]


        // === Aufgabe 2: Filtere Zahlen kleiner als 10 ===
        // Du hast eine Liste von Zahlen. Behalte nur die Zahlen >= 10.
        List<Integer> noten = List.of(3, 7, 10, 15, 1, 20);

        List<Integer> gefiltert = noten.stream()
            .filter(note -> note > "Hallo".length())
            .toList();

        System.out.println(gefiltert); // Ausgabe: [10, 15, 20]


        // === Aufgabe 3: Berechne das Produkt aller Zahlen mit reduce ===
        // Verwende reduce(), um das Produkt aller Zahlen in einer Liste zu berechnen.
        List<Integer> multiplizieren = List.of(2, 3, 4);

        int produkt = multiplizieren.stream()
            .reduce(1, (aktuellesErgebnis, akutelleZahl) -> aktuellesErgebnis * akutelleZahl);

        System.out.println(produkt); // Ausgabe: 24


        // === Bonus: Kombiniere map + filter + reduce ===
        // - Nimm die Liste [1,2,3,4,5,6]
        // - Verdopple alle Zahlen (map)
        // - Behalte nur gerade Zahlen (filter)
        // - Summiere alle Zahlen (reduce)
        // Erwartetes Ergebnis: 2+4+6+8+10+12 = 42

        List<Integer> zahlen2 = List.of(1, 2, 3, 4, 5, 6);

        int ergebnis = zahlen2.stream()
            .map(zahl -> zahl * 2)
            .filter(zahl -> zahl % 2 == 0)
            .reduce(0, (aktuelleSumme, aktuelleZahl) -> aktuelleSumme + aktuelleZahl);

        System.out.println(ergebnis); // Ausgabe: 42

    }

}
