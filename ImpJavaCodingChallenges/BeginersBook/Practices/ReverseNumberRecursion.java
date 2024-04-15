public class ReverseNumberRecursion {
    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        return reverseNumber(num / 10, reversed * 10 + num % 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number, 0);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
