import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("How many items wanna buy:");

            int count = scanner.nextInt();
            scanner.nextLine();
            String[] items = new String[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Item " + (i+1) + ": ");
                items[i] = scanner.nextLine();
            }
            System.out.println("All items entered!");
            System.out.println("Shopping List:");

            int num = 0;
            for (int i = 0; i < count; i++) {
                System.out.printf(items[i] + " ");
                num++;
            }
            System.out.println("\nNumber of items: " + num);

            // Searching feature
            System.out.print("Search an item?(Y/N)");
            String yesORno = scanner.nextLine();
            if (yesORno.equalsIgnoreCase("Y")){
                System.out.printf("Searching item: ");
                String searchItem = scanner.nextLine();
                searchItem(items,searchItem);
            } else if (yesORno.equalsIgnoreCase("N")){
                System.out.println("Program is finished.");
            } else {
                System.out.println("Error: Pls enter Y or N.");
            }

        }catch (InputMismatchException e) {
            System.out.println("Error: Pls enter a number value.");
        } catch (Exception e) {
            System.out.println("Unknown error.");
        } finally {
            scanner.close();
        }

    }


    static void searchItem(String[] items, String searchItem){

        String foundItem = "";
        for (int i = 0; i < items.length; i++) {
            if (searchItem.equalsIgnoreCase(items[i])){
                foundItem = items[i];
            }
        }
        if (!foundItem.equals(""))
            System.out.println("Searching item is found: " + foundItem);
        else
            System.out.println("This item is not found.");

    }
}


