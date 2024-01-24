public class loopsConcept {
    public static void main(String[] args) {
        // Looping in Java is done using the "for" loop. 
        //repeat this statement 4 times
        //loop -while, d0 while, for
        //100 - consition

        //for loop
       
        //while loop
        int i =1;
        while(i<=4)
        {
            System.out.println("Hi " + i);
            int j=1;
            while(j<=3){
                System.out.println("Hello");
                j++;
            }
            i++;
        }
        System.out.println("Bye "+i);

        //do-while loop
        int k =5;  
        do   
        {
            System.out.println("Hi " + k);
            k++;
        }while(k<=4);

        //for loop
        for(int j=1;j<=5;j++){
            System.out.println("Day "+ j);

            for(int m=1;m<=9;m++){
                System.out.println(" "+ (m+8)+" - " + (m+9));
            }
        }

        
    }
}
