package org.example;

import java.util.Scanner;

/**
 *  Name: Matthew Tomkins
 *  Class Group: SD2b
 */

public class Question6      // Flight take-off (Queue)
{

    public static void main(String[] args)
    {
        System.out.println("Question 6\n__________\n");
        System.out.println("Commands:\n'takeoff' followed by flightcode\n'land' followed by flightcode\n'next'\n'quit'\n");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter command (takeoff, land, next, quit):");
            String command = scan.nextLine().trim();

            if (command.startsWith("takeoff")) {

            }
            else if (command.startsWith("land")) {

            }
            else if (command.equals("next")) {

            }

            else if (command.equals("quit")) {
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("Invalid command, enter(takeoff, land, next, or quit)");
            }



        }
    }
}
