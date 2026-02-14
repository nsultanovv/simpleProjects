import java.util.Scanner;

public class CalculatorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number2: ");
            double num2 = sc.nextDouble();

            System.out.print("Select the operation[ '+' '-' '*' '/' ] : ");
            char oper = sc.next().charAt(0);

            switch (oper){
                case '+':
                    System.out.print("Plus selected: ");
                    System.out.println(num1 + " + " + num2 + " = " + plusMethod(num1,num2));
                    break;
                case '-':
                    System.out.print("Minus selected: ");
                    System.out.println(num1 + " - " + num2 + " = " + minusMethod(num1,num2));
                    break;
                case '*':
                    System.out.print("Multiply selected: ");
                    System.out.println(num1 + " * " + num2 + " = " + multiplyMethod(num1,num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.print("Divide selected: ");
                        System.out.println(num1 + " / " + num2 + " = " + divideMethod(num1, num2));
                    }
                    break;

                default:
                    System.out.println("Operator error.!");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

    }

    static double plusMethod(double num1, double num2){
        return num1+num2;
    }
    static double minusMethod(double num1, double num2){
        return num1-num2;
    }
    static double multiplyMethod(double num1, double num2){
        return num1*num2;
    }
    static double divideMethod(double num1, double num2){
        return num1/num2;
    }
}
