public class CheckVowelOrConsonant {
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' ||  ch == 'e' || ch == 'i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args){
        char character = 'a';

        if (Character.isLetter(character)){
            if(isVowel(character)){
                System.out.println(character + " is a vowel");
            } else{
                System.out.println(character + " is a consonant");
            }
        }else{
            System.out.println(character + " is not a letter");
        }
    }
    
}
