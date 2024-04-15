import java.util.Scanner;

public class CheckLeapYear {
    //type-1 easy
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true; // If divisible by 400, it's a leap year
        } else if (year % 100 == 0) {
            return false; // If divisible by 100 but not by 400, it's not a leap year
        } else {
            return year % 4 == 0; // If divisible by 4 but not by 100, it's a leap year
        }
    }

    //type-2 hard
    // public static boolean isLeapYear(int year){
    //     boolean divisibleBy4 = year % 4 == 0;
    //     boolean divisibleBy100 = year % 100 == 0;
    //     boolean divisibleBy400 = year % 400 ==0;

    //     return divisibleBy400 || (divisibleBy4 && !divisibleBy100) ;
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        sc.close();
        if(isLeapYear(year)){
            System.out.println(year + " is a Leap year. ");
        }else{
            System.out.println(year + " is not a Leap year");
        }
    }
}
