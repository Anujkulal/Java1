
// package Java1;
import java.util.Scanner;

public class Test1 {
    public static void calculator(double a, double b, String op) {
        double result;
        switch (op) {
            case "+":
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case "/":
                if (b == 0)
                    System.out.println("Cannot divide by zero");
                else {
                    result = a/b;
                    System.out.println(a + " / " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        System.out.print("Enter the operator: ");
        String op = sc.next();
        calculator(num1, num2, op);
        sc.close();
    }
}
