import java.util.Scanner;

public class StudentAvrGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades do you have(1-5)? ");
        int counter = scanner.nextInt();

        if (counter < 1 || counter > 5){
            System.out.println("Invalid number, enter 1 to 5.");
        }
        else {
            double sum = 0;

            for (int i = 1; i <= counter; i++) {
                System.out.print("Enter grade " + i + ": ");
                double grade = scanner.nextInt();
                sum += grade;
            }
            double average = sum/counter;

            System.out.println("Average: " + average);
            System.out.println("Letter: " + gradeMethod(average));

        }
    }

    public static char gradeMethod(double average){

        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else return 'F';

    }
}

