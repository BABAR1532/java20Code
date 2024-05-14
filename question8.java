import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Develop a program to calculate the area of a triangle given its base and
        // height.
        System.out.println("Enter the Base of Traingle");
        int base = reader.nextInt();

        System.out.println("Enter the height of triangle");
        int height = reader.nextInt();

        double area = (0.5) * base * height;

        System.out.println("Area of triangle is " + area);

        // closing reader
        reader.close();
    }

}
