import java.util.Scanner;
public class EvenOddExamples{
    public static void main(String[] args) {
        //Program to check if the number entered by user is even or odd
        // int num;
        // System.out.println("Enter a Integer number");

        // Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();

        // if(num % 2 == 0){
        //     System.out.println(num + " is an even number.");
        // }else{
        //     System.out.println(num + " is an odd number.");
        // }

        //Program to check even odd number using ternary operator
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer number");
        int num = sc.nextInt();

        String evenOrOdd = (num % 2 == 0)?"even": "odd";
        System.out.println(evenOrOdd);

    }
}