package alex.cc;
import java.util.Scanner;

//Create a function that takes a number as an argument and returns true if the number is a valid credit card number, false otherwise.
//
//        Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:
//
//        Remove the last digit (this is the "check digit").
//        Reverse the number.
//        Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
//        Add all digits.
//        Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.

public class creditCardCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        System.out.println("This is a credit card number checker. We will check whether your " +
                "credit card number is valid or not.");
        do{
            System.out.println("Enter the credit card number here: ");
            long number = scanner.nextLong();
            Card card = new Card(number);
            if (card.checkLength()) {
                System.out.println("This number is the correct size.");
                if (card.luhnTest()) {
                    System.out.println("This number passes the Luhn test. It is a valid credit card number.");
                } else {
                    System.out.println("This number fails the Luhn test. It is not a valid credit card number.");
                }
            }
            else {
                System.out.println("This is the incorrect size. It must be between 14-19 numbers.");
            }


            System.out.println("Would you like to check a new number? (Enter yes (or y) for yes: ");
            String repeat = scanner.next();
            check = (repeat.equalsIgnoreCase("y") || repeat.equalsIgnoreCase("yes"));
        } while (check);
    }
}
