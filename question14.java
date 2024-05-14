import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Create a program to determine if a given character is a vowel or a consonant.
        System.out.println("Enter character");
        String input = reader.next();

        // Validating if string contain single character or not
        if (input.length() == 1) {
            char ch = input.charAt(0);

            if (isVowel(ch)) {
                System.out.println(ch + " is Vowel");
            } else {
                System.out.println(ch + " is consonant");
            }
        } else {
            System.out.println("Input invalid! please enter one character");
        }

        // closing reader
        reader.close();
    }

    // Method to check charactar is vowel
    public static boolean isVowel(char ch) {

        // Converting to lower case
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

    }

}
