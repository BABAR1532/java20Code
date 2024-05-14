import java.util.Scanner;

class question1 {
    public static void main(String[] args) {

        // Creating object from Scanner class
        Scanner reader = new Scanner(System.in);

        // Write a program to calculate the area of a rectangular garden given its
        // length and width.
        int length;
        int width;

        System.out.println("Enter the Length of garden: ");
        length = reader.nextInt();

        System.out.println("Enter the width of garden");
        width = reader.nextInt();

        int areaGarden = length * width;

        System.out.println("Area of Garden is " + areaGarden);

        // Closing reader object
        reader.close();

    }
}