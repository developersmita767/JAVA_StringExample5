//Write a program to convert a string to character array.
import java.util.Scanner;

public class StringExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Output the character array
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
