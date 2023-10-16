package math;

import java.util.Scanner;

public class MathWithMethodReturn
{
    public static void main(String[] args)
    {
        // Menu item constants.
        final int ADD = 1;
        final int SUBTRACT = 2;
        final int MULTIPLY = 3;
        final int DIVIDE = 4;
        final int QUIT = 5;
        
        // Welcome user and get initial number.
        System.out.println("Welcome!  This program will allow you to perform several mathematical operations.");
        System.out.print("What number would you like to start with? ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // Display menu and get user's menu choice.
        int choice = displayMenu(number, input);
        
        while (choice != QUIT)
        {
            switch (choice)
            {
                case ADD:
                    // Add 100 and display current number.
                    number += 100; // number = number + 100;
                    System.out.println("Adding 100.");
                    break;
                case SUBTRACT:
                    // Subtract 50 and display current number.
                    number -= 50;
                    System.out.println("Subtracting 50.");
                    break;
                case MULTIPLY:
                    // Multiply by 2 and display current number.
                    number *= 2;
                    System.out.println("Multiplying by 2.");
                    break;
                case DIVIDE:
                    // Divide by 3 and display current number.
                    number /= 3;
                    System.out.println("Dividing by 3.");
                    break;
                case QUIT:
                    System.out.println("You chose to quit.");
                    break;
                default:
                    // The user chose an invalid option.  Tell him/her and display current number.
                    System.out.println("Error, invalid menu option.");
                    break;
            }
        
            // Display menu and get user's menu choice.
            choice = displayMenu(number, input);
        }
        
        // Display final number to user.
        System.out.println();
        System.out.println("Your final number is " + number + ". Have a great day!");
    }
    
    public static int displayMenu(int number, Scanner input)
    {
        // Output the menu options.
        System.out.println();
        System.out.println("--- MATH MENU ---");
        System.out.println("1. Add 100.");
        System.out.println("2. Subtract 50.");
        System.out.println("3. Multiply by 2.");
        System.out.println("4. Divide by 3.");
        System.out.println("5. Quit.");
        
        // Tell the user their current number.
        System.out.println("Your current number is " + number + ".");
        
        // Get user's menu choice.
        System.out.print("What operation would you like to perform? ");
        int userChoice = input.nextInt();
        
        // Return user's menu choice.
        return userChoice;
    }
}
