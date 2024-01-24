public class conditionalStatements {
    public static void main(String[] args) {
        int x=18;
        if(x>10){
            System.out.println("Hello");
        }else{
            System.out.println("Byee");
        }


        int a=8;
        int b=17;
        int c=9;
        if(a>b){
            System.out.println(a);
            System.out.println("Thank You");
        }else{
            System.out.println(b);
        }

        if(a>b && a>c){
            System.out.println("Both conditions are true");
        }else if(b>c && b>a){
            System.out.println("Second condition is true");
        }else{
            System.out.println(c);
        }
        
    }
}
