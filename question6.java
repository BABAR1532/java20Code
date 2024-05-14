import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Create a program to calculate the perimeter of a square given its side
        // length.

        System.out.println("Enter any side of square:");
        int side = reader.nextInt();

        System.out.println("Perimeter of square is  " + (4 * side));

        // Closing reader
        reader.close();
    }

}
