package Übungen.code.Java;

public class IterationVsRekursion {

    // Fakultät iterativ berechnen

    // Start n = 5
    // Von i 1 bis 5, multipliziere ergebnis mit i
    // ergbnis startet mit 1
    // 1 * 1 -> 1 * 2 -> 2 * 3 -> 6 * 4 -> 24 * 5 = 120
    public static int fakultaetIterativ(int n) {
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Aktuelles Ergebnis: " + ergebnis + " i: " + i + " Neues Ergebnis: " + (ergebnis * i));
            ergebnis = ergebnis * i;
        }

        return ergebnis;
    }

    // Fakultät rekursiv berechnen
    public static int fakultaetRekursiv(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fakultaetRekursiv(n -1);
        }
    }

    // Fibonacci iterativ berechnen
    public static int fibonacciIterativ(int n) {
        return 0;
    }

    // Fibonacci rekursiv berechnen
    public static int fibonacciRekursiv(int n) {
        return 0;
    }

    public static void main(String[] args) {
        int zahl = 5;

        // Maximale Zahl, die mit Integer dargestellt werden kann: -2 147 483 647 bis 2 147 483 647

        System.out.println("Fakultät Iterativ von " + zahl + ": " + fakultaetIterativ(zahl));
        System.out.println("Fakultät Rekursiv von " + zahl + ": " + fakultaetRekursiv(zahl));

        System.out.println("Fibonacci Iterativ an Position " + zahl + ": " + fibonacciIterativ(zahl));
        System.out.println("Fibonacci Rekursiv an Position " + zahl + ": " + fibonacciRekursiv(zahl));

    }
}