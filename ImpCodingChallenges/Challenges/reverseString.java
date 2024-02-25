package ImpCodingChallenges.Challenges;

// //Brute Force Approach
// public class reverseString{
//     public static String reverseBruteForce(String s){
//         String reversed = "";

//         for(int i=s.length()-1;i>=0;i--){
//             reversed += s.charAt(i);
//         }
//         return reversed;
//     }

//     public static void main(String[] args){
//         String input = "Hello";
//         String reversed = reverseBruteForce(input);
//         System.out.println("Original String : "+ input);
//         System.out.println("Revesed string (Brute Force): "+ reversed);
//     }
// }

//Optimal Approach
public class reverseString{
    public static String reverseOptimal(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args){
        String input = "Hello";
        String reversed = reverseOptimal(input);
        System.out.println("Original String : "+ input);
        System.out.println("Reversed String(Optimal) : "+ reversed);
    }
}