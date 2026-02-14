import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> book = new ArrayList<>();

        while(true){
            System.out.println("||==============MENU==============||");
            System.out.println("|| Add number: '+'                ||");
            System.out.println("|| Remove number: '-'             ||");
            System.out.println("|| Update number: '$'             ||");
            System.out.println("|| View existing numbers: '#'     ||");
            System.out.println("|| Exit: 'q'                      ||");
            System.out.println("||================================||");
            System.out.print("Enter: ");
            char menu = sc.next().charAt(0);
            sc.nextLine(); // bo'sh qatordan qutulish

            switch (menu){
                case '+':
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("\nPhone: ");
                    String phone = sc.nextLine();
                    book.add(new Contact(name,phone));
                    System.out.println("Contact added!");
                    break;
                case '-':
                    System.out.print("Name to remove: ");
                    String remName = sc.nextLine();
                    System.out.print("\nPhone to remove: ");
                    String remPhone = sc.nextLine();
                    book.remove(new Contact(remName,remPhone));
                    break;
                case '$':
                    System.out.printf("Name to update: ");
                    String updName = sc.nextLine();
                    boolean found = false;
                    for (Contact c : book){
                        if (c.name.equals(updName)){
                            System.out.printf("New phone: ");
                            c.phone = sc.nextLine();
                            System.out.println("Contact updated!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Contact not found");
                    break;
                case '#':
                    System.out.println("All contacts: ");
                    for (Contact c : book ){
                        System.out.println(c.name + " - " + c.phone);
                    }
                    break;
                case 'q':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Error command! Try again.");
            }
        }




    }
}
