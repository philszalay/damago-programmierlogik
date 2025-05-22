package Übungen.code.Java;

// Dieses Übungsblatt behandelt verschiedene Arten der Werteübergabe in Java:
// - Call by Value (z. B. bei int, float, boolean, char)
// - Call by Object / Referenz (z. B. bei Arrays und eigenen Klassen)
// Jede Übung ist kommentiert und enthält eine Beispielimplementierung.

public class Werteuebergabe {

    // ========== ÜBUNG 1: Call by Value mit int ==========
    public static void quadriere(int x) {
        x = x * x;
        System.out.println("In Methode quadriere: " + x);
    }

    public static void uebung1() {
        int zahl = 7;
        quadriere(zahl); // Übergabe der Kopie von zahl
        System.out.println("Zahl nach Methode: " + zahl);
    }

    // ========== ÜBUNG 2: Call by Object mit Array ==========
    public static void ersetzeErstenWert(int[] arr) {
        if (arr != null && arr.length > 0) {
            arr[0] = 100;
        }
    }

    public static void uebung2() {
        int[] zahlen = {1, 2, 3};
        ersetzeErstenWert(zahlen);
        System.out.print("Array nach Methode: ");
        for (int z : zahlen) {
            System.out.print(z + " ");
        }
        System.out.println();
    }

    // ========== ÜBUNG 3: Referenzüberschreibung testen ==========
    public static void ersetzeArray(int[] arr) {
        arr = new int[]{99, 88, 77}; // Neue Referenz – wirkt nicht auf das Ursprungsarray
    }

    public static void uebung3() {
        int[] werte = {10, 20, 30};
        System.out.println("Vor Methode: " + werte[0]);
        ersetzeArray(werte);
        System.out.println("Nach Methode: " + werte[0]);
    }

    // ========== ÜBUNG 4: String vs. Array Verhalten ==========
    public static void aendereString(String s) {
        s = "Karl";
        System.out.println("In Methode aendereString: " + s);
    }

    public static void aendereArray(String[] arr) {
        if (arr != null && arr.length > 0) {
            arr[0] = "Karl";
        }
    }

    public static void uebung4() {
        String name = "Lisa";
        String[] namen = {"Lisa", "Paul"};

        aendereString(name);
        aendereArray(namen);

        System.out.println("String nach Methode: " + name);
        System.out.print("Array nach Methode: ");
        for (String n : namen) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // ========== ÜBUNG 5: Eigene Klasse als Objektübergabe ==========
    public static void aendereName(Person p) {
        p.name = "Max"; // Änderung über die Referenz wirkt auf das Objekt
    }

    public static void uebung5() {
        Person person = new Person();
        person.name = "Anna";
        person.alter = 25;

        aendereName(person);
        System.out.println("Name nach Methode: " + person.name);
    }

    // Hauptmethode zum Testen der Übungen
    public static void main(String[] args) {
        System.out.println("==== Übung 1 ====");
        uebung1();

        System.out.println("\n==== Übung 2 ====");
        uebung2();

        System.out.println("\n==== Übung 3 ====");
        uebung3();

        System.out.println("\n==== Übung 4 ====");
        uebung4();

        System.out.println("\n==== Übung 5 ====");
        uebung5();
    }
}

// ===================== HILFSKLASSEN =====================

class Person {
    String name;
    int alter;
}
