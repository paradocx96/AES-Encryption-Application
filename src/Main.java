import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("NETWORKED PROGRAM");
            System.out.println("\n@Sender");

            // Generate a secret key
            AES_ENCRYPTION aes_encryption = new AES_ENCRYPTION();
            aes_encryption.init();

            // Getting user message
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Message: ");
            String sender_message = scanner.nextLine();
            System.out.println("Sender Message: " + sender_message);

            // Encrypt user message
            String encryptedData = aes_encryption.encrypt(sender_message);

            // Display the encrypted string
            System.out.println("Encrypted Data: " + encryptedData);
            System.out.println("\n@Receiver");
            System.out.println("Encrypted Data: " + encryptedData);

            // Decrypt the user message
            String decryptedData = aes_encryption.decrypt(encryptedData);

            // Display original message
            System.out.println("Received Message: " + decryptedData);
        } catch (Exception ignored) {
        }
    }
}