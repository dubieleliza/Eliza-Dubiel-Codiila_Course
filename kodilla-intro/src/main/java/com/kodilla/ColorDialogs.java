package com.kodilla;
import java.util.Scanner;

public class ColorDialogs {
    public static String getColorByFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą literę koloru (R,G,B,Y,O,P,W):");
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Nic nie wpisałeś. Spróbuj jeszcze raz.");
                continue;
            }
            char ch = Character.toUpperCase(line.charAt(0));
            switch (ch) {
                case 'R': return "Red";
                case 'G': return "Green";
                case 'B': return "Blue";
                case 'Y': return "Yellow";
                case 'O': return "Orange";
                case 'P': return "Purple";
                case 'W': return "White";
                default:
                    System.out.println("Nieznana litera: '" + line.charAt(0) + "'. Spróbuj ponownie.");
            }
        }
    }
}

