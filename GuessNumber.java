import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(101);   // 0-100 gacha son tanlandi
        System.out.println(randomNum);               // random sonni korsatish
        Scanner sc = new Scanner(System.in);
        int n = -1;

        while (n != randomNum){

            try {
                System.out.print("Guess the number (0-100) : ");
                n = sc.nextInt();

                if (n > randomNum && n <= 100){
                    System.out.print("Too high. Guess again: ");
                }else if (n < randomNum && n >= 0) {
                    System.out.print("Too low. Guess again: ");
                }else if (n < 0 || n > 100){
                    System.out.println("Number must be between 0 and 100!");
                }else {
                    System.out.println("You win!");
                }

            } catch (Exception e) {
                  System.out.println("Error! Enter only integer value.");
                  sc.next();   // buffer tozalash
            }
        }
        sc.close();
    }
}