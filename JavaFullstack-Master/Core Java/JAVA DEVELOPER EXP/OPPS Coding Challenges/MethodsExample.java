public class MethodsExample {
    // Method with no return value and no parameters
    public static void greet() {
        System.out.println("Hello, Java!");
    }

    // Method with return value and parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public void  printSum(int x, int y) {  
        System.out.printf("The sum of %d and %d is %d.",x,y,x+y);  
    }

    public static void main(String[] args) {
        // Calling the greet() method
        greet();

        // Calling the add() method
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        MethodsExample m = new MethodsExample();
        m.printSum(7, 7);
        
    }
}
