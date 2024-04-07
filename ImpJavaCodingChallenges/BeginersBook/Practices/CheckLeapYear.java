public class CheckLeapYear {
    public static boolean isLeapYear(int year){
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 ==0;

        return divisibleBy400 || (divisibleBy4 && !divisibleBy100) ;
    }

    public static void main(String[] args){
        int year = 2024;
        if(isLeapYear(year)){
            System.out.println(year + " is a Leap year. ");
        }else{
            System.out.println(year + " is not a Leap year");
        }
    }
}
