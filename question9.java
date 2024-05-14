import java.util.Scanner;

public class question9 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Implement a program to calculate the volume of a cylinder given its radius
        // and height.

        System.out.println("Enter  radius of cylinder");
        double radius = reader.nextDouble();

        System.out.println("Enter height of triangle ");
        double height = reader.nextDouble();

        System.out.println("Volume of cylinder is " + (Math.PI * radius * radius * height));

        // Closing reader
        reader.close();

    }
}
