package Calculator;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age = 0;  // variable to store valid age

        // Keep asking until the user enters an integer
        while (true) {
            System.out.print("Please enter your age: ");

            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age >= 0) {
                    break;  // Valid age → exit loop
                } else {
                    System.out.println("Age cannot be negative. Please enter a valid age.");
                }
            } else {
                System.out.println("That's not a valid input. Please enter an integer.");
                input.next();  // clear the invalid input
            }
        }

        //Checks unrealistic positive ages
        if (age > 100) {
            System.out.println("🎉 Congratulations! You lived " + (age - 100) + " extra bonus years!");
        } else {
            System.out.println("You have " + (100 - age) + " years left until you are 100 years old.");
        }

        input.close();

    }
}
