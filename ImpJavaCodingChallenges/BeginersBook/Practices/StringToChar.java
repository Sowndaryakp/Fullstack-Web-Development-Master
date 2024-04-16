public class StringToChar {
        public static void main(String[] args) {
            // Convert char to String
            char ch = 'a';
            String charToString = Character.toString(ch);
            System.out.println("Char to String : "+ charToString);
            
            // Convert String to char
            String str = "Hello";
            char[] charArray = str.toCharArray();
            System.out.println("String to Characters: ");
            for(char chr: charArray){
                System.out.println(chr);
            }
        }
    }
    