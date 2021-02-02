package com.Dgb;

import java.util.Scanner;

public class loopbreaker {

    public static boolean breaker(){ // this class has this function call breaker that will terminate my program
        boolean terminator = false; // a default boolean variable
        Scanner scanner = new Scanner(System.in); // our scanner object to read the data in
        System.out.print("(Type anything to continue quit to terminate the program): "); //  a simple pprint statement
        String input = scanner.nextLine().toLowerCase(); // asking user for an input  and converting it to lowercase
        if (input.equals("quit")){terminator = true; return terminator;}  // if user types quit the program simply returns ture
        else
        {return terminator;}// else it stays false by default


    }


}
