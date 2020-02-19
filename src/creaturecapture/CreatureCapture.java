/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaturecapture;

import java.util.*;

/**
 *
 * @author Dil Bdr
 */
public class CreatureCapture {

    public static final int WEBCAST = 10;
    public static final int FORCEBUBBLE = 20;
    public static int FreezeBay;
    //private int x;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Player player;
        Creature creature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to creature capture!");

        // Construct the player object.
        Player player1 = new Player();

        // Main loop, that spawns new creatures and starts capture.
        // Continue until the player has run out of energy.
        while (player1.getenergy() > 0) {
            System.out.println("\n\nA new creature has appeared!");

            // Set creature to a new instance of your creature class.
            Random randomGenerator = new Random();
            int speed = randomGenerator.nextInt(25) + 1;
            int strength = randomGenerator.nextInt(25) + 1;
            Creature c2 = new Creature(speed, strength);

            // Inner loop to capture individual creature.
            // Loop while creature not captured and player has energy left.
            while (!c2.CreatureCaptured() && player1.getenergy() > 0) {

                // Tell the player how much energy they have left.
                System.out.println("Player has this much energy left: " + player1.getenergy() + "\n");

                // Prompt for player action
                System.out.println("You can \nf) Fire a freeze ray\nw) Cast a web \nb) Throw a force bubble \n");

                System.out.print("What is your choice: ");
                String reply = scanner.nextLine();
                switch (reply) {
                    case "f":
                        // Prompt for the amount to freeze
                        System.out.print("How much energy do you want to use: ");
                        int amount = Integer.parseInt(scanner.nextLine());

                        // Subtract that energy from the player (if legal). If not,
                        // print "You don't have that much energy".
                        if (player1.getenergy() >= amount) {

                            player1.Freeze(amount);

                        } else {
                            System.out.println("You don't have enough energy.");
                        }

                        // Fire the freeze ray at the creature and print the message
                        // "The creature appears slower and weaker!" If the creature has
                        // been frozen, print "The creature has been frozen".
                        if (player1.getenergy() >= amount) {
                            c2.FreezeRay(amount);

                            if (c2.CreatureCaptured()) {

                                System.out.println("Creature is captured.");
                            }
                        } else {
                            System.out.println("The creature seems weaker and slower.");
                        }

                        break;

                    case "w":
                        // Subtract that energy from the player (if legal).
                        // If there is not enough energy, print "You don't have enough energy! 
                        // Casting a web has cost ______!"

                        if (player1.getenergy() >= CreatureCapture.WEBCAST) {
                            player1.Web(WEBCAST);

                        } else {
                            System.out.println("You don't have enough energy! ");
                        }

                        // Try casting the web at the creature. If the creature has been 
                        // captured, print "The creature is caught in your web!"
                        // Otherwise, print "The creature is too fast for your web!
                        if (player1.getenergy() >= WEBCAST && c2.getSpeed() < 5) {
                            c2.WebCast();
                            c2.CreatureCaptured();
                            System.out.println("The creature is caught in your web!");
                        } else {
                            System.out.println("The creature is too fast for your web");
                        }

                        break;

                    case "b":
                        // Subtract that energy from the player (if legal).
                        // If there is not enough energy, print "You don't have enough energy! 
                        // Throwing a force bubble has cost ______!"

                        if (player1.getenergy() >= FORCEBUBBLE) {
                            player1.Bubble(FORCEBUBBLE);

                        } else {
                            System.out.println("You don't have enough energy!");
                        }

                        // Try throwing the bubble at the creature. If the creature has been 
                        // captured, print "The creature is trapped in the bubble!". 
                        // Otherwise, print "The creature breaks free of the bubble!"
                        if (c2.ForceBubble()) {
                            System.out.println("The creature is trapped in the bubble!\n");
                        } else {
                            System.out.println("The creature breaks free of the bubble!");
                        }

                        break;
                }

                // If the creature was captured, add the creature's reward
                // to the player's energy and print a message telling them how 
                // much they gained. Also print their current energy level.
                if (c2.CreatureCaptured()) {
                    int energy = c2.totalenergy();
                    player1.EnergyAdded(energy);
                    System.out.println("You have gained  " + c2.totalenergy() + " energy");
                    System.out.println("The currenty energy is : " + player1.getenergy());

                }

            }
        }
        System.out.println("You ran out of energy! Game over!");
    }

}
