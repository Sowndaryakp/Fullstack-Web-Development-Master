public class ternaryOperator {
    public static void main(String[] args) {
        //normal if-else code
        int n = 10;
        String result = " ";

        // if(n%2==0){
        //     result = "Even";
        // }else{
        //     result = "Odd";
        // }
        //ternary operator
        result = n%2==0 ? "Even" : "odd";
        System.out.println(result);
    }
}
