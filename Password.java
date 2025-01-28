import java.security.SecureRandom;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwordLength = 10;
        System.out.println("Password generator");
        System.out.println("Enter UPPERCASE :");
        String UPPERCASE = sc.nextLine();
        System.out.println("Enter lowercase :");
        String lowercase = sc.nextLine();
        System.out.println("Enter Digits :");
        int Digits = sc.nextInt();
        System.out.println("Enter characters :");
        String characters = sc.nextLine();
        String combineChars = UPPERCASE + lowercase + Digits + characters;
        String password = generatePassword(passwordLength, combineChars);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, String characters) {
        StringBuilder password = new StringBuilder(length);
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}