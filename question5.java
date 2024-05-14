import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Implement a program to calculate the total price of items in a grocery list.
        System.out.println("Enter the number of item in list:");
        int numItems = reader.nextInt();

        int totalPrice = 0;

        for (int i = 0; i < numItems; i++) {

            System.out.println("Enter the name of item: ");
            String itemName = reader.nextLine();

            reader.nextLine();

            System.out.println("Enter the price of " + itemName);
            totalPrice += reader.nextInt();

        }

        System.out.println("Total price of items " + totalPrice);

        // closing reader
        reader.close();
    }
}
