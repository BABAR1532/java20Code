import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Create a program to find the maximum of two given numbers.
        System.out.println("Enter the first number:");
        int num1 = reader.nextInt();

        System.out.println("Enter the second nubmer:");
        int num2 = reader.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum of given two number is  " + max);

        // closing reader
        reader.close();
    }

}
