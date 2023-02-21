package automationandprogramming;

import java.util.Scanner;

public class MorseCodeTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseCodeProcessor morseCodeProcessor = new MorseCodeProcessor();
        boolean running = true;

        while (running) {
            System.out.println("Please select an option: ");
            System.out.println("1. Translate English to Morse");
            System.out.println("2. Translate Morse to English");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Please enter text to translate: ");
                System.out.println(morseCodeProcessor.encodeString(scanner.nextLine().toUpperCase()));
            } else if (option == 2) {
                System.out.println("Please enter morse code to translate (\"/\" represents space): ");
                System.out.println(morseCodeProcessor.decodeString(scanner.nextLine()));
            } else if (option == 3) {
                running = false;
            } else {
                System.out.println("Not a valid option");
            }
        }
    }
}
