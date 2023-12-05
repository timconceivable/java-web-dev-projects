package src.main.java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args)
            throws FileNotFoundException {
// BONUS- get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to use the default text \nor ENTER YOUR OWN TEXT: ");
        String sampleText = input.nextLine();
        input.close();
// BONUS- read text from file
        if (sampleText.isEmpty()) {
            File textFile = new File("./collections-studio/src/main/resources/sample.txt");
            Scanner text = new Scanner(textFile);
            sampleText += text.nextLine();
            System.out.println("SAMPLE TEXT:\n" + sampleText + "\n");
        }
// BONUS- make array case-insensitive
        char[] charArray = sampleText.toLowerCase().toCharArray();
        HashMap<Character, Integer> charList = new HashMap<>();

        for (char chr : charArray) {
// BONUS- check if characters are alphanumeric
            if (Character.isLetterOrDigit(chr)) {
                if (charList.containsKey(chr)) {
                    charList.put(chr, charList.get(chr) + 1);
                } else {
                    charList.put(chr, 1);
                }
            }
        }
// PRINT LETTERS AND THEIR COUNTS
/*        for (Character c : charList.keySet()) {
            System.out.println(c + ": " + charList.get(c) );
        }
*/
// MORE ADVANCED ITERATION OVER HASHMAP
        charList.forEach( (key, value) ->
            System.out.println(key + ": " + value)
        );
    }
}