package alex;

public class alexExercises {
    public static void main(String[] args) {
        System.out.println("FIBONACCI");
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(12));
        System.out.println("PALINDROME");
        System.out.println(isPalindrome("racecar") + " true");
        System.out.println(isPalindrome("green") + " false");
    }
    // prints the nth fibonacci number for whatever number is passed
    private static int fibonacci(int number) {
        int[] sequence = new int[number + 1];
        sequence[0] = 0;
        sequence[1] = 1;
        System.out.print(sequence[0] +  "," + sequence[1]);
        for (int i = 2; i < sequence.length; i++){
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            System.out.print("," + sequence[i]);
        }
        System.out.print(" Number: ");
        return sequence[number];
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
