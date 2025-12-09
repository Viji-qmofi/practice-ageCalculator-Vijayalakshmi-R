package Calculator;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your age: ");
        if (input.hasNextInt()) {
            int age = input.nextInt();
            System.out.println("You have " + (100 - age) + " years left until you are 100 years old.");
        } else {
            System.out.println("That's not a valid input. Please enter an integer.");
            input.next();
            if (input.hasNextInt()) {
                int age = input.nextInt();
                System.out.println("You have " + (100 - age) + " years left until you are 100 years old.");
            } else {
                System.out.println("That's not a valid input. Please enter an integer.");
            }
        }
        input.close();
    }
}
