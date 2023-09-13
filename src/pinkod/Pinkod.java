package pinkod;

import java.util.Scanner;

public class Pinkod {

    static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        Beker();
    }

    public static void Beker() {
        System.out.println("Kérem adjon meg egy uj 4 szamu pint: ");
        int Pin = src.nextInt();
        int pinLength = Integer.toString(Pin).length();
        while (pinLength < 4 || pinLength > 6) {
            System.out.println("-ERROR- Kérem 4 szamu legyen a pin: ");
            Pin = src.nextInt();
            pinLength = Integer.toString(Pin).length();
        }
        System.out.println("Pin elmentve");
        System.out.println("-----------------");
        System.out.println("Kérem adja meg a belepesi kodot: ");
        boolean helyes = false;
        for (int i = 0; i < 3; i++) {
            int bekertPin = src.nextInt();
            if (bekertPin != Pin) {
                System.out.println("Sikertelen belepes, kérem adja meg a kodot ujra(" + (i + 1) + "/3): ");
            }else{
                i = 3;
                helyes = true;
            }
            

        }
        if (helyes == true) {
            System.out.println("Sikeres belepes.");
        } else {
            System.out.println("Belepes megtagadva.");
        }
    }
}
