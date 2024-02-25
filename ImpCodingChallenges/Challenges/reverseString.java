package ImpCodingChallenges.Challenges;

public class reverseString{
    public static String reverseBruteForce(String s){
        String reversed = "";

        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args){
        String input = "Hello";
        String reversed = reverseBruteForce(input);
        System.out.println("Original String : "+ input);
        System.out.println("Revesed string (Brute Force): "+ reversed);
    }
}
