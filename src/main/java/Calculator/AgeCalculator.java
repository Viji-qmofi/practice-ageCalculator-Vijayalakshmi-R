package Calculator;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

    System.out.println("No of years to reach 100 is " + (100 - age));
    }
}
