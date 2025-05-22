package Übungen.code.Java;

public class Kontrollstrukturen {
    
    public static void main(String[] args) {
        
        // 1 Schreibe ein Programm, das überprüft, ob eine Zahl größer als 10 ist.

        double zahl = 15.00;

        if (zahl > 10) {
            System.out.println("Zahl ist größer als 10");
            zahl = zahl + 10;
        } else {
            System.out.println("Zahl ist kleiner als 10");
            zahl = zahl - 10;
        }

        System.out.println("Zahl: " + zahl);

        // 2 Gib zu einer Note (1–6) eine Bewertung aus (z.B. „Sehr gut“).
        int meineNote = 2;

        if (meineNote == 1) {
            System.out.println("Sehr gut");
        } else if (meineNote == 2) {
            System.out.println("Gut");
        } else if (meineNote == 3) {
            System.out.println("Befriedigen");
        } else if (meineNote == 4) {
            System.out.println("Ausreichend");
        } else if (meineNote == 5) {
            System.out.println("Mangelhaft");
        } else if (meineNote == 6) {
            System.out.println("Ungenügend");
        }

        // 3 Zähle mit einer while-Schleife von 1 bis 5.

        for(int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        // 4 Erstelle ein Array mit 3 Farben und gib sie mit einer for-Schleife aus.
        String[] farben = {"Gelb", "Gründ", "Blau"};

        for(int i = 0; i < farben.length; i++) {
            System.out.println(farben[i]);
        }

        // 5 Füge eine switch-Verzweigung ein, die je nach Wochentag etwas anderes ausgibt.
        String wochentag = "Dienstag";

        switch (wochentag) {
            case "Montag":
                System.out.println("Es ist Montag");
                break;
            case "Dienstag":
                System.out.println("Es ist Dienstag");
                break;
            case "Mittwoch":
                System.out.println("Es ist Mittwoch");
                break;
            case "Donnerstag":
                System.out.println("Es ist Donnerstag");
                break;
            case "Freitag":
                System.out.println("Es ist Freitag");
                break;
            case "Samstag":
                System.out.println("Es ist Samstag");
                break;
            case "Sonntag":
                System.out.println("Es ist Sonntag");
                break;
        
            default:
                break;
        }

    }

}
