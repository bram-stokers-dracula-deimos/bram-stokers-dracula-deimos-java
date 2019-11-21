public class alexExercises {
    public static void main(String[] args) {
        fizzBuzz();
        System.out.println(isPalindrome("racecar") + " true");
        System.out.println(isPalindrome("green") + " false");
    }
    // standard fizzbuzz function
    private static void fizzBuzz() {
        System.out.println("This is Fizzbuzz.");
        for(int i = 0; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    // prints reverse of word and checks if palindrome
    private static boolean isPalindrome(String word) {
        System.out.println("Word: " + word);
        System.out.print("Reverse: ");
        String[] reverse = word.split("");
        StringBuilder reversed = new StringBuilder();
        for (int i = reverse.length - 1; i >= 0; i--){
            System.out.print(reverse[i]);
            reversed.append(reverse[i]);
        }
        System.out.print("\n");
        return reversed.toString().equals(word);
    }
    //


}
