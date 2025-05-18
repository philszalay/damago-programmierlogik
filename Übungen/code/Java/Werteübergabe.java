package Übungen.code.Java;

// Dieses Übungsblatt behandelt verschiedene Arten der Werteübergabe in Java:
// - Call by Value (z. B. bei int, float, boolean, char)
// - Call by Object / Referenz (z. B. bei Arrays und eigenen Klassen)
// Jede Übung ist kommentiert und enthält keine Lösung – die Schüler:innen sollen sie selbst entwickeln.

public class Werteübergabe {

    // ========== ÜBUNG 1: Call by Value mit int ==========
    // Aufgabe:
    // Erstelle eine Methode namens `quadriere`, die eine int-Zahl entgegennimmt und sie quadriert.
    // Gib die veränderte Zahl NICHT zurück.
    // Beobachte, ob sich der Wert im Hauptprogramm verändert hat.

    public static void uebung1() {
        int zahl = 7;
        // Rufe hier die Methode quadriere(zahl) auf

        // Danach: Gib die Zahl aus – ist sie verändert?
        System.out.println("Zahl nach Methode: " + zahl);
    }

    // ========== ÜBUNG 2: Call by Object mit Array ==========
    // Aufgabe:
    // Erstelle eine Methode `ersetzeErstenWert`, die den ersten Wert eines int[]-Arrays auf 100 setzt.

    public static void uebung2() {
        int[] zahlen = {1, 2, 3};
        // Rufe ersetzeErstenWert(zahlen) auf

        // Gib alle Werte des Arrays aus – was hat sich verändert?
    }

    // ========== ÜBUNG 3: Referenzüberschreibung testen ==========
    // Aufgabe:
    // Erstelle eine Methode `ersetzeArray`, die ein neues Array erzeugt und es der Übergabevariable zuweist.
    // Beobachte: Ändert sich das ursprüngliche Array?

    public static void uebung3() {
        int[] werte = {10, 20, 30};
        // Gib werte[0] aus

        // Rufe ersetzeArray(werte) auf

        // Gib werte[0] erneut aus
    }

    // ========== ÜBUNG 4: String vs. Array Verhalten ==========
    // Aufgabe:
    // Erstelle zwei Methoden:
    // - `aendereString(String s)` → Ändere den String auf einen neuen Namen
    // - `aendereArray(String[] arr)` → Ändere das erste Element im Array

    public static void uebung4() {
        String name = "Lisa";
        String[] namen = {"Lisa", "Paul"};

        // Rufe beide Methoden auf

        // Gib danach den String und das Array aus
        // Was wurde verändert?
    }

    // ========== ÜBUNG 5: Eigene Klasse als Objektübergabe ==========
    // Aufgabe:
    // Erstelle eine Methode `aendereName(Person p)`, die den Namen der Person auf "Max" ändert.
    // Hat das Auswirkungen auf das ursprüngliche Objekt?

    public static void uebung5() {
        Person person = new Person();
        person.name = "Anna";
        person.alter = 25;

        // Rufe aendereName(person) auf

        // Gib danach den Namen der Person aus
        // Wurde er verändert?
    }

    // Hauptmethode zum Testen der Übungen
    public static void main(String[] args) {
        // Hier kannst du einzelne Übungen ausführen, z. B.:
        // uebung1();
        // uebung2();
        // ...
    }
}

// ===================== HILFSKLASSEN =====================

// Klasse für Übung 5
class Person {
    String name;
    int alter;
}