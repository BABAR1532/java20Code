import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Develop a program to calculate the factorial of a given number.
        System.out.println("Enter the number(Number must be positive) :");
        int number = reader.nextInt();

        long factorial = 1;

        for (int i = 0; i < number; i++) {
            factorial *= (i + 1);
        }

        System.out.println("Factorial of " + number + " is " + factorial);

        // closing reader
        reader.close();
    }

}
