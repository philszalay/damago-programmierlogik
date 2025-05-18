package Übungen.code.Java;
// Datei: Datentypen.java
// Zweck: Übungsdatei zu Java-Datentypen und Datenstrukturen.
// Anleitung: Lies die Kommentare, bearbeite jede Aufgabe (TODO).

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Datentypen {

    public static void main(String[] args) {
        //
        // ------------- Primitive Datentypen -------------
        //

        // 1) int
        // Erklärung:
        //   - Ein int speichert eine ganze Zahl (z. B. 0, 42, -7).
        //   - Syntax:   int variableName = ganzZahl;
        //   - Beispiel: int alter = 25;
        //
        // Aufgabe 1.1:
        //   Lege eine Variable vom Typ int an mit Namen "geburtsjahr"
        //   und weise ihr dein Geburtsjahr zu.
        //
        // TODO: int geburtsjahr = ...;


        // 2) float / double
        // Erklärung:
        //   - float und double speichern Kommazahlen.
        //   - double ist "größer" (mehr Nachkommastellen) als float.
        //   - Bei float muss man ein "f" anhängen:  float pi = 3.14f;
        //   - double pi = 3.141592653589793;
        //
        // Aufgabe 2.1:
        //   Definiere eine float-Variable namens "temperatur" und weise
        //   ihr einen Wert mit einer Nachkommastelle zu (z. B. 23.5f).
        //
        // TODO: float temperatur = ...f;
        //
        // Aufgabe 2.2:
        //   Definiere eine double-Variable namens "kontostand" und weise
        //   ihr einen Wert mit zwei Nachkommastellen zu (z. B. 1000.50).
        //
        // TODO: double kontostand = ...

        
        // 3) boolean
        // Erklärung:
        //   - Ein boolean speichert true oder false (Wahr/Falsch).
        //   - Syntax:   boolean variableName = true;  oder  = false;
        //
        // Aufgabe 3.1:
        //   Erstelle eine boolean-Variable namens "istVolljaehrig" und weise
        //   ihr true oder false zu (je nachdem, ob du bereits 18 bist).
        //
        // TODO: boolean istVolljaehrig = ...;


        // 4) char
        // Erklärung:
        //   - Ein char speichert genau ein Zeichen in einfachen Anführungszeichen.
        //   - Beispiel: char buchstabe = 'A';
        //   - Unicode-Zeichen funktionieren ebenfalls (z. B. '\u00E4' für 'ä').
        //
        // Aufgabe 4.1:
        //   Definiere eine char-Variable namens "initiale" und setze sie auf
        //   den ersten Buchstaben deines Vornamens.
        //
        // TODO: char initiale = ' ';


        // 5) String
        // Erklärung:
        //   - Ein String speichert eine Zeichenkette in doppelten Anführungszeichen.
        //   - Beispiel: String name = "Max";
        //
        // Aufgabe 5.1:
        //   Leg eine String-Variable namens "nachricht" an und weise ihr einen
        //   beliebigen kurzen Text (z. B. "Hallo Welt") zu.
        //
        // TODO: String nachricht = "...";


        //
        // ------------- Arrays -------------
        //

        // 6) int[]
        // Erklärung:
        //   - Ein int[] ist ein Array aus int-Werten (feste Länge).
        //   - Syntax (Initialisierung mit Werten):
        //         int[] zahlen = {1, 2, 3};
        //   - Oder:  int[] zahlen = new int[5]; // Länge 5, initial alle 0
        //
        // Aufgabe 6.1:
        //   Erstelle ein int-Array namens "noten" mit genau drei Werten, z. B. {2, 3, 1}.
        //
        // TODO: int[] noten = { ..., ..., ... };

        // 7) float[]
        // Erklärung:
        //   - Ein float[] speichert mehrere Kommazahlen.
        //   - Syntax: float[] messen = {36.5f, 37.0f, 38.2f};
        //
        // Aufgabe 7.1:
        //   Lege ein float-Array mit dem Namen "temperaturen" an und füge
        //   mindestens zwei Werte mit Nachkommastellen ein.
        //
        // TODO: float[] temperaturen = { ..., ... };

        // 8) boolean[]
        // Erklärung:
        //   - Ein boolean[] speichert mehrere Wahrheitswerte.
        //   - Beispiel: boolean[] antworten = {true, false, true};
        //
        // Aufgabe 8.1:
        //   Definiere ein boolean-Array "anwesend" mit drei Einträgen
        //   (true/false), z. B. {true, false, true}.
        //
        // TODO: boolean[] anwesend = { ..., ..., ... };

        // 9) String[]
        // Erklärung:
        //   - Ein String[] speichert mehrere Zeichenketten.
        //   - Beispiel: String[] namen = {"Anna", "Ben", "Clara"};
        //
        // Aufgabe 9.1:
        //   Erstelle ein String-Array mit dem Namen "namen" und speichere
        //   drei verschiedene Namen darin.
        //
        // TODO: String[] namen = { "...", "...", "..." };


        //
        // ------------- List und Map -------------
        //

        // 10) List<String>
        // Erklärung:
        //   - Eine List<String> (z. B. ArrayList<String>) ist eine dynamische Liste.
        //   - Man kann Elemente hinzufügen (add) und entfernen (remove).
        //   - Benötigt immer: List<String> liste = new ArrayList<>();
        //
        // Aufgabe 10.1:
        //   Erzeuge eine List<String> namens "einkaufsliste" und füge drei
        //   Produkte nacheinander mit methode add() hinzu (z. B. "Brot").
        //
        // TODO:
        // List<String> einkaufsliste = new ArrayList<>();
        // einkaufsliste.add("...");
        // einkaufsliste.add("...");
        // einkaufsliste.add("...");


        // 11) Map<String, Integer>
        // Erklärung:
        //   - Eine Map<String, Integer> (z. B. HashMap<String, Integer>) speichert
        //     Schlüssel-Wert-Paare, hier von String → Integer.
        //   - Benötigt immer: Map<String, Integer> map = new HashMap<>();
        //   - Elemente hinzufügen mit put(schluessel, wert).
        //
        // Aufgabe 11.1:
        //   Erzeuge eine Map<String, Integer> namens "punktestand" und füge
        //   mindestens zwei Einträge hinzu, z. B. ("Anna", 15).
        //
        // TODO:
        // Map<String, Integer> punktestand = new HashMap<>();
        // punktestand.put("...", ...);
        // punktestand.put("...", ...);


        // 12) Map<String, String>
        // Erklärung:
        //   - Eine Map<String, String> speichert Schlüssel-Wert-Paare von String → String.
        //   - Beispiel: Benutzername → E-Mail-Adresse
        //
        // Aufgabe 12.1:
        //   Lege eine Map<String, String> namens "benutzerEmail" an und füge
        //   mindestens zwei Einträge hinzu (z. B. "max" → "max@mail.de").
        //
        // TODO:
        // Map<String, String> benutzerEmail = new HashMap<>();
        // benutzerEmail.put("...", "...");
        // benutzerEmail.put("...", "...");


        //
        // ------------- Ausgabe / Kontrolle -------------
        //

        // Aufgabe 13:
        //   Gib den Wert der Variable "alter" in der Konsole aus:
        //
        // TODO: System.out.println("Alter: " + alter);

        // Aufgabe 14:
        //   Gib einen Eintrag aus dem int-Array "noten" aus,
        //   z. B. noten[0] oder noten[2].
        //
        // TODO: System.out.println("Erste Note: " + noten[0]);

        // Aufgabe 15:
        //   Gib ein Element der List "einkaufsliste" aus,
        //   z. B. einkaufsliste.get(1).
        //
        // TODO: System.out.println("Zweites Produkt: " + einkaufsliste.get(1));

        // Aufgabe 16:
        //   Gib einen Wert aus der Map "punktestand" aus,
        //   z. B. punktestand.get("Anna").
        //
        // TODO: System.out.println("Punkte von Anna: " + punktestand.get("Anna"));

        // Aufgabe 17:
        //   Gib eine E-Mail-Adresse aus der Map "benutzerEmail" aus,
        //   z. B. benutzerEmail.get("max").
        //
        // TODO: System.out.println("E-Mail von max: " + benutzerEmail.get("max"));
    }
}