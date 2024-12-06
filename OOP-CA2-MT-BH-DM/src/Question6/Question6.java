package org.example.Question6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Name: Matthew Tomkins
 *  Class Group: SD2b
 */

public class Question6      // Flight take-off (Queue)
{
    public static void main(String[] args)
    {
        ArrayList<String>takeoffQueue= new ArrayList<>();
        ArrayList<String>landingQueue= new ArrayList<>();

        System.out.println("Question 6\n__________\n");
        System.out.println("""
                > Commands:
                'takeoff' followed by flightcode
                'land' followed by flightcode
                'next'
                'quit'
                """);
        Scanner scan = new Scanner(System.in);
        while(true){
            //System.out.print("Enter command (takeoff, land, next, quit):");
            String command = scan.nextLine().trim();

            if (command.startsWith("takeoff")) {
               takeoff(command, takeoffQueue);
            }
            else if (command.startsWith("land")) {
               land(command, landingQueue);
            }
            else if (command.equals("next")) {
                next(takeoffQueue, landingQueue );
            }

            else if (command.equals("quit")) {
                System.out.println("> "+"Exiting program...");
                break;
            }
            else {
                System.out.println("> "+"Invalid command, enter(takeoff, land, next, or quit)");
            }
            //System.out.println(takeoffQueue);
            //System.out.println(landingQueue);
        }
    }

    public static void takeoff(String command, ArrayList<String> takeoffQueue){
        String flightCode = command.substring(8).trim();//cuts off the command and a space
        takeoffQueue.add(flightCode);

        System.out.println("> "+flightCode + " queued for takeoff.");
}

    public static void land(String command, ArrayList<String> landingQueue){
        String flightCode = command.substring(5).trim();//cuts off the command and a space
        landingQueue.add(flightCode);

        System.out.println("> "+flightCode + " queued for landing.");
    }

    public static void next(ArrayList<String> takeoffQueue, ArrayList<String> landingQueue){
        if (!landingQueue.isEmpty()) {//checks arraylist for elements
            String flightCode = landingQueue.removeFirst();//removes the flight at 0

            System.out.println("> "+"Landing flight: " + flightCode);
        }
        else if (!takeoffQueue.isEmpty()) {
            String flightCode = takeoffQueue.removeFirst();

            System.out.println("> "+"Taking off flight: " + flightCode);
        }
        else {
            System.out.println("> "+"There are planes in the queue to take off or land.");
        }
    }
}
