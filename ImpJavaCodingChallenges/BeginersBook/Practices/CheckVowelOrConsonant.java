public class CheckVowelOrConsonant {
    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        char ch = 'a';
        if (Character.isLetter(ch)) {
            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a valid alphabet.");
        }
    }
    
}
