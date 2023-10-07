import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the number first: ");
         int num1 = in.nextInt();
         System.out.println("Enter the number second: ");
         int num2 = in.nextInt();
         System.out.println("Enter the operator: ");
         String op=in.next();
         calculator(num1, num2, op);
         in.close();

    }

    static void calculator(int num1, int num2, String op) {
        double res = 0;
        switch (op) {
            case "+":
                res = add(num1, num2);
                System.out.println("Result is: " + res);
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the next Value: ");
                int num3 = sc.nextInt();
                System.out.println("Enter the operator: ");
                String op1 = sc.next();
                calculator((int) res, num3, op1);
                break;
            case "-":
                res = sub(num1, num2);
                System.out.println("Result is: " + res);
                sc = new Scanner(System.in);
                System.out.println("Enter the next Value: ");
                int num4 = sc.nextInt();
                System.out.println("Enter the operator: ");
                String op2 = sc.next();
                calculator((int) res, num4, op2);
                break;
            case "*":
                res = mul(num1, num2);
                System.out.println("Result is: " + res);
                sc = new Scanner(System.in);
                System.out.println("Enter the next Value: ");
                int num5 = sc.nextInt();
                System.out.println("Enter the operator: ");
                String op3 = sc.next();
                calculator((int) res, num5, op3);
                break;
            case "/":
                res = div(num1, num2);
                System.out.println("Result is: " + res);
                sc = new Scanner(System.in);
                System.out.println("Enter the next Value: ");
                int num6 = sc.nextInt();
                System.out.println("Enter the operator: ");
                String op4 = sc.next();
                calculator((int) res, num6, op4);
                break;
            case "AC":
                return;
            case "Exit":
                System.out.println("Thank you");
                return;
            default:
                System.out.println("Simple Calculator");
                return;
        }
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }

    static double div(int num1, int num2) {
        try {
            double res = num1 / num2;
            return res;
        } catch (Exception e) {
            System.out.println("Can't divide by zero");
        }
        return 0;
    }

}
