package quiz;

import java.util.Scanner;

public class ShiftCipherApp {
    public static void main (String[] args)
    {
        int shift;
        String message;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Shift Cipher Algorithm Quiz");
            System.out.println("===========================");
            System.out.print("How many shifts would you want to use? ");
            try {
                shift = sc.nextInt();
                sc.nextLine(); // Consume the next line
            } catch (Exception e) {
                System.out.println("That is not an integer.");
                System.exit(0);
                return;
            }
            System.out.println("Please enter a message to hit enter to encrypt it.");
            message = sc.nextLine();
        }
        ShiftCipher app = new ShiftCipher(message, shift);
        // Show the Cipher string
        app.cipher();
        System.out.println("Encrypted: " + app.getCipher());
        // Show the Deciphered string
        app.decipher();
        System.out.println("Decrypted: " + app.getDecipher() );
    }
   
}

