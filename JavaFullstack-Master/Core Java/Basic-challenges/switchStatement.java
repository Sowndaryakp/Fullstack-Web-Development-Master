public class switchStatement {
    public static void main(String[] args) {
        int n=7;
        //not good way
        // if(n==1)
        //     System.out.println("Sunday");
        // else if(n==2)
        //     System.out.println("Monday");
        // else if(n==2)
        //     System.out.println("Tuesday");
        // else if(n==2)
        //     System.out.println("WEdnesday");
        // else if(n==2)
        //     System.out.println("Thursday");
        // else if(n==2)
        //     System.out.println("Friday");
        // else
        //     System.out.println("Saturday");

        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Enter the valid number");
        }

        //java 12 introduced new thing 
        // String day = "Sunday";
        // switch(day){
        //     case "Sunday" -> System.out.println("6am");
        //     case "Monday", "Tuesday" -> System.out.println("9am");
        //     case "Wednesday" -> System.out.print("9am ");
        //     default -> System.out.println("9am");
        // }

        //switch as an Expression
        // String day = "Sunday";
        // String result="";
        // switch(day){
        //     case "Sunday" -> result = "6am";
        //     case "Monday", "Tuesday" -> result = "2am";
        //     case "Wednesday" -> result = "4am";
        //     default -> result = "9am";
        // }
            //or
            String day = "Sunday";
        String result="";
        result = switch(day){
            case "Sunday" -> yield "6am";
            case "Monday", "Tuesday" -> yield "2am";
            case "Wednesday" ->yield "4am";
            default ->yield "9am";
        }

    }
}
