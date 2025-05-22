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

        int geburtsjahr = 1994;


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

        float temperatur = 100024.57654357237823f;

        double kontostand = 0.00000000001;

        
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

        boolean istVolljaehrig = true;


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

        char initiale = 'P';


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

        String nachricht = "Hallo was geht?";


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

        int[] noten = {1,2,3};

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

        float[] temperaturen = {36.5f, 37.f};

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

        boolean[] anwesend = {true, false, true};

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

        String[] namen = {"Anna", "Ben", "Clara"};


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
        List<String> einkaufsliste = new ArrayList<>();
        einkaufsliste.add("...");
        einkaufsliste.add("...");
        einkaufsliste.add("...");


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
        Map<String, Integer> punktestand = new HashMap<>();
        punktestand.put("Phil", 10);
        punktestand.put("Lisa", -10);
        punktestand.put("Anna", 99);
        punktestand.put("Anna", 10);


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
        Map<String, String> benutzerEmail = new HashMap<>();
        benutzerEmail.put("Phil", "phil@mail");
        benutzerEmail.put("Lisa", "lisa@mail");


        //
        // ------------- Ausgabe / Kontrolle -------------
        //

        // Aufgabe 13:
        //   Gib den Wert der Variable "alter" in der Konsole aus:
        //
        System.out.println("Alter: " + geburtsjahr);

        // Aufgabe 14:
        //   Gib einen Eintrag aus dem int-Array "noten" aus,
        //   z. B. noten[0] oder noten[2].
        //
        System.out.println("Erste Note: " + noten[0]);

        // Aufgabe 15:
        //   Gib ein Element der List "einkaufsliste" aus,
        //   z. B. einkaufsliste.get(1).
        //
        System.out.println("Zweites Produkt: " + einkaufsliste.get(1));

        // Aufgabe 16:
        //   Gib einen Wert aus der Map "punktestand" aus,
        //   z. B. punktestand.get("Anna").
        //
        System.out.println("Punkte von Anna: " + punktestand.get("Anna"));

        // Aufgabe 17:
        //   Gib eine E-Mail-Adresse aus der Map "benutzerEmail" aus,
        //   z. B. benutzerEmail.get("max").
        //
        System.out.println("E-Mail von max: " + benutzerEmail.get("max"));










        List<List<Integer>> list = new ArrayList<>();

        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(2);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(4);

        list.add(innerList);
        list.add(innerList2);

        System.out.println("Erste Liste: " + list.get(0));
        System.out.println("Erste Liste, zweites Element " + list.get(0).get(1));


        Map<String, Map<String, Double>> map = new HashMap<>();

        Map<String, Double> innerMap = new HashMap<>();
        innerMap.put("Mathematik", 1.5);
        innerMap.put("Englisch", 2.7);

        Map<String, Double> innerMap2 = new HashMap<>();
        innerMap2.put("Mathematik", 3.0);
        innerMap2.put("Englisch", 4.5);

        map.put("Max", innerMap);
        map.put("Anna", innerMap2);

        System.out.println("Noten von Max: " + map.get("Max"));
        System.out.println("Note von Max, Mathematik: " + map.get("Max").get("Mathematik"));

        System.out.println("");

        System.out.println("-----------------");

        System.out.println("");

        // 1 Erstelle zwei Ganzzahlen und berechne ihre Summe, Differenz und das Produkt.

        int a = 5;
        int b = 2;

        int summe = a + b;
        int differenz = a - b;
        int produkt = a * b;

        System.out.println("Summe: " + summe);
        System.out.println("Summe: " + differenz);
        System.out.println("Summe: " + produkt);

        // 2 Teile eine Zahl durch eine andere und gib das Ergebnis als float aus.

        float c = 10.0f;
        int d = 3;

        // int / int => int

        // float / int => float

        float ergebnis = c / d;

        System.out.println("Ergebnis: " + ergebnis);

        
        // 3 Vergleiche zwei Zahlen: Ist die eine größer als die andere?

        // int > int => boolean
        boolean groesser = a > b;

        // float > int => boolean
        boolean groesserFloat = c > a;

        // string > int => ???
        String testString = "Hallo";

        boolean groesserString = testString.length() > a;

        System.out.println("Größer: " + groesser);

        System.out.println("Größer Float: " + groesserFloat);

        System.out.println("Größer String Länge: " + groesserString);

        // 4 Erstelle zwei String-Variablen (z.B. Vorname und Nachname) und füge sie zu
        // einem vollständigen Namen zusammen.

        String titel = "String gesamt (ohne Variable): ";
        String string1 = "Hallo, ";
        String string2 = "wie geht's";

        String stringGesamt = string1 + string2;

        System.out.println("String gesamt: " + stringGesamt);

        System.out.println(titel + stringGesamt);

        
        // 5 Gib die Länge eines Strings aus.
        int laengeTitel = titel.length();

        System.out.println("Länge Titel: " + laengeTitel);

        // 6 Erstelle ein String[]-Array mit mindestens 3 Städtenamen und gib den zweiten
        // Namen aus.

        String[] staedte = {"Hamburg", "München", "Köln", "Bremen", "Stuttgart"};

        System.out.println("Drittes Element: " + staedte[2]);

        // Länge staedte = 5
        // staedte[5] = ???
        // staedte[4] == letztes Element (5. Element)
        String letztesElement = staedte[staedte.length - 1];

        System.out.println("Letztes Element: " + letztesElement);

         // 7 Erstelle eine List<String> mit mindestens 3 Lieblingsessen und füge ein
        // weiteres hinzu.

        List<String> lieblingsessen = new ArrayList<>();

        lieblingsessen.add("Pizza");
        lieblingsessen.add("Curry");
        lieblingsessen.add("Spätzle");

        System.out.println(lieblingsessen.get(0));

        // 8 Erstelle eine Map<String, Integer> mit Namen und Alter. Lies das Alter einer
        // Person aus der Map.

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Anna", 40);

        System.out.println("Alter von Anna: " + map2.get("Anna"));
    }
}