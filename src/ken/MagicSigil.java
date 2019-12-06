package ken;

/*A magic sigil is a glyph which represents a desire one wishes to manifest in their lives. There are many ways to create a sigil, but the most common is to write out a specific desire (e.g. "I HAVE WONDERFUL FRIENDS WHO LOVE ME"), remove all vowels, remove any duplicate letters and then design a glyph from what remains.

Using the sentence above as an example, we would remove duplicate letters:

AUFRINDSWHLOVME
And then remove all vowels, leaving us with:

FRNDSWHLVM
Create a function that takes a string and removes its vowels and duplicate letters. The returned string should not contain any spaces and be in uppercase.*/


public class MagicSigil {

//    part one : method kick vowels out
    public static String removeVowels(String input){
        input = input.replace("a", "");
        input = input.replace("A", "");
        input = input.replace("e", "");
        input = input.replace("E", "");
        input = input.replace("i", "");
        input = input.replace("I", "");
        input = input.replace("o", "");
        input = input.replace("O", "");
        input = input.replace("u", "");
        input = input.replace("U", "");
        return input;
    };

// part two: duplicate character check
//    first loop = INDEX 0 MATCH INDEX 0 - 1 - 2 - 3 - 4 - 5

    public static void countDupiChar(String input){
        int count = 0;
        char[] inputarray = input.toCharArray();
        for (int i = 0; i < inputarray.length; i++){
            for (int j = i + 1; j < inputarray.length; j++){
                if (inputarray[i] == inputarray[j]){
                    count++;
                }            }
        }
        System.out.println("count = " + count);
    }


//    Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.
    public static boolean verifyXsOs(String input){
        int xcount = 0;
        int ocount = 0;
        char [] inputToArray = input.toCharArray();
        for (int i = 0; i < inputToArray.length; i++){
            if (inputToArray[i] == 'x'){
                xcount++;
            }
            if (inputToArray[i] == 'o'){
                ocount++;
            }
        }
        return xcount == ocount;

    };

    public static void main(String[] args) {
        System.out.println("removeVowels(\"vowels out of here!\") = " + removeVowels("vowels out of here!"));
        System.out.println("removeVowels(\"vowels out of here!\") = " + removeVowels("you know what I hate? VOWELS"));

        countDupiChar("aabcddefgg");
        countDupiChar("aab");

        System.out.println("verifyXsOs(\"xxoo\") = " + verifyXsOs("xxoo"));
        System.out.println("verifyXsOs(\"zzoo\") = " + verifyXsOs("zzoo"));
        System.out.println("verifyXsOs(\"pqrs\") = " + verifyXsOs("pqrs"));


    }
}
