package com.Dgb;

import java.util.Random;
import java.util.Scanner;


/*

In a file called Nim.java, write a main method to play the following version of the game of Nim:

The user will play against the computer. A random number decides who takes first turn.
A random number between 10 and 100 inclusive represents the number of matchsticks on the table.
The players take turns to pick up a number of matchsticks:
When it is the user's turn, the programs asks the user how many matchsticks s/he wishes to pick up.
When it is the computer's turn, a random number determines how many matchsticks it will pick up.
However, they must pick up at least one and at most half of the matchsticks. For example, if there are 16 matchsticks, they can pick up between 1 and 8 inclusive; if there are 15 matchsticks, they can pick up between 1 and 7 inclusive.
The player who picks up the last remaining matchstick loses.
Include enough print/println statements so that the user knows what's going on.
 */



public class Nim {
    public static void main(String[] args) {
        java.util.Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean computer_turn = false;
        boolean players_turn = false;
        int matchsticks = 10+rand.nextInt(90);
        while(matchsticks != 0) {
            int turn = 1+rand.nextInt(2);
            if (turn == 1){computer_turn=true;}
            else{players_turn=true;}
            if (players_turn) {
                if (matchsticks != 1) {
                    System.out.print("Out of " + matchsticks / 2 + " How many matchsticks you would like to pick up: ");
                    int players_choice = scanner.nextInt();
                    if (players_choice <= 0) {
                        System.out.println("You must pickup at least 1 matchstick");
                    } else if (players_choice > matchsticks / 2) {
                        System.out.println("You cannot pick up more than " + matchsticks / 2 + "Matchsticks");
                    } else {
                        matchsticks = matchsticks - players_choice;
                        players_turn = false;
                    }
                }
                else{
                    System.out.println("Player lost Computer WOn");
                    break;
                }
            } if (computer_turn) {
                if (matchsticks != 1) {
                    int computer_choice = 1 + rand.nextInt(matchsticks / 2);
                    matchsticks = matchsticks - computer_choice;
                    computer_turn = false;
                }
                else{
                    System.out.println("Computer Lost User WON");
                    break;
                }
            }
        }






        }



    }






