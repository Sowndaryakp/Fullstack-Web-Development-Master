class Calculator {
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}

public class classAndObjects {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add(number1, number2);
        System.out.println(result);
    }
}
