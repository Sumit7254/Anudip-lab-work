import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        
        int max = (num1 > num2) ? num1 : num2;

        
        System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
