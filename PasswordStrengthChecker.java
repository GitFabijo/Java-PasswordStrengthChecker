import java.util.Scanner;

/**
 * Programm liest..
 * @author RAJIC FABIJO
 * @version 2026-01-17
 */

public class PasswordStrengthChecker {
    public static void main(String[] args) {
    
    // Erstellt Scanner-Objekt für Konsoleneingabe
    Scanner scanner = new Scanner(System.in);

    // Eingabe
    System.out.print("Bitte Passwort eingeben: ");

     // Passwort einlesen
    String password = scanner.nextLine();

     // Ausgabe
    System.out.println("Du hast eingegeben " + password);
    
    // Methode aufrufen
    boolean longEnough = isLongEnough(password);

    boolean hasNumber = containsNumber(password);

    // Ergebnis ausgeben
    System.out.println("Mindestens 8 Zeichen: " + longEnough);

    // Ergebnis Ausgeben
    System.out.println("Enthält Zahl:" +hasNumber);


    // Schließt Scanner 
    scanner.close();
    }
    public static boolean isLongEnough(String password) {
        if(password.length() >= 8){
            return true;
        } else {
            return  false;
        }
    }

    public static boolean containsNumber(String password) {
        // geht Zeichen für Zeichen durch das Passwort
        for ( int i = 0; i < password.length(); i++) {
            
            // einzelnes Zeichen
            char currentChar = password.charAt(i);

            // Fragt, ob das eine Zahl istn
            if(Character.isDigit(currentChar)) {
                // Falls eine Zahl gefunden ist 
                return true;
            }
        }
        // Falls keine Zahl drinenn war 
        return false;
    }
}