// C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
// from a-z)

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase());
        System.out.println("Is it a pangram? " + isPangram);
    }

    public static boolean isPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
