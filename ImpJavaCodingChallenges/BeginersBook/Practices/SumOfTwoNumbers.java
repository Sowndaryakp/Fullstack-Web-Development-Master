import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        //sum of two numbers
        // int num1 = 20, num2 = 20, sum;
        // sum = num1 + num2;
        // System.out.println(sum);

        //Sum of two numbers using Scanner
        // int num1, num2, sum;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // num1 = sc.nextInt();

        // System.out.println("Enter second number");
        // num2 = sc.nextInt();
        // sc.close();

        // sum = num1 + num2;
        // System.out.println("sum = "+ sum);

        // Program to add two non-integer numbers
        double num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextDouble();

        System.out.println("Enter second number");
        num2 = sc.nextDouble();
        sc.close();

        sum = num1 + num2;
        System.out.println("sum = "+ sum);

    }

    
}
