package Übungen.code.Java;

import java.util.Arrays;
import java.util.Collections;

public class Bubblesort {

    // Diese Methode soll ein Array mit Zahlen sortieren
    public static void bubbleSort(int[] array) {
        // int[] zahlen = {5, 2, 9, 1, 3, 100, 566734532, 23, -1234, 234, 0};
        int n = array.length; // = 11
        
        // Outer loop für die Anzahl der Durchläufe
        for (int i = 0; i < n - 1; i = i + 1) {
            // Inner loop für den Vergleich der benachbarten Elemente
            for (int j = 0; j < n - 1 - i; j = j + 1) {
                // Vergleiche benachbarte Elemente und tausche sie, wenn sie in der falschen Reihenfolge sind
                if (array[j] > array[j + 1]) {
                    // Tausch der Elemente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
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
        int[] zahlen = {5, 2, 9, 1, 3, 100, 566734532, 23, -1234, 234, 0};

        System.out.println("Unsortiertes Array:");
        printArray(zahlen);

        // Rufe die Sortiermethode auf
        //bubbleSort(zahlen);
        Arrays.sort(zahlen);

        System.out.println("Sortiertes Array:");
        printArray(zahlen);
    }
}
