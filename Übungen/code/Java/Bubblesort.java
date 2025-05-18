package Übungen.code.Java;

public class Bubblesort {

    // Diese Methode soll ein Array mit Zahlen sortieren
    public static void bubbleSort(int[] array) {
        // TODO: Schreibe hier den Bubble Sort Algorithmus
    }

    // Diese Methode hilft dabei, das Array in der Konsole auszugeben
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Beispiel-Array zum Testen
        int[] zahlen = {5, 2, 9, 1, 3};

        System.out.println("Unsortiertes Array:");
        printArray(zahlen);

        // Rufe die Sortiermethode auf
        bubbleSort(zahlen);

        System.out.println("Sortiertes Array:");
        printArray(zahlen);
    }
}
