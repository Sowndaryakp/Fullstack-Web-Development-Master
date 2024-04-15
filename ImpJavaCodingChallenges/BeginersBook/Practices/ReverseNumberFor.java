public class ReverseNumberFor {
    public static int reverseNumber(int num){
        int reversed = 0;
        for(;num!=0;num/=10){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public static void main(String[] args){
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);
    }
}
