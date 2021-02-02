package com.Dgb;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(FizzBuzz());
//        System.out.println(rand());
//        rand_number_between_two_values();
//        string_length();
//        test();
//        string_fix();
//        a_func();





    }


//  this involves some random programs and some form Dgb

    public static String FizzBuzz(){ // our function that returns a string

        try{
            Scanner scanner = new Scanner(System.in); // our scanner to read the data from the terminal
            while (!loopbreaker.breaker()) { // WHile our breaker function form loopbreaker class is nnot true continue executing the code below if ie until use dosent type quit
                System.out.print("Please enter an integer:");
                int userInput = scanner.nextInt(); // reading an integer input
                if (userInput < 0) { // our general fizzBuzz fizz buzz code
                    System.out.println("Please enter a positive a number ");
                } else if (userInput % 3 == 0 && userInput % 5 == 0) { // if the digit is a multiple of 5 and is a multiple of 3 as well ie reminder is zero after division return FizzBuzz
                    System.out.println("FizzBuzz");
                } else if (userInput % 3 == 0) { // if the input is  a multiple of 3
                    System.out.println("Fizz");
                } else if (userInput % 5 == 0){ // if the input is a multiple of 5
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(userInput);
                }
            }
            //loopbreaker.breaker();
            return "Program terminated";
        }
        catch (Exception e){ // if Ivan messes
           // return "Please check your input";
            return "Error is : "+ e ;

        }

    }





        public static int rand(){
        //other way of random numbers
            java.util.Random randy = new java.util.Random();
            for(int i= 0; i < 10; i++) {
                int val = randy.nextInt(101);
                System.out.println(val);
            }
            return -1;




    }
    public static void rand_number_between_two_values() {
        java.util.Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int val = 80 + rand.nextInt(11); // this generates random numbers between 80 and 90
            System.out.println(val);

            // our syntax is   java.util.Random rand = new Random();
            //int val = <from this number x> + rand.nextInt(<TO this number y (-)x   >);
            // eg we wan 10 to hundred ---> 100 -10 = 90
            //int val = 10 + rand.nextInt(90); (Sum of 10 + 90 gives us  100)

        }
    }


// to get a length of a sting

    public static void string_length(){
        String x = "HelloWorld";
        int len = x.length();
        System.out.println(len);
        for(int i = 0; i <= len; i++){
            System.out.println(x.charAt(i));

        }


    }

    public static void test(){
        int x = 2;
        int y = 3;
        System.out.println("My fav num is :" + x+y);// here java first converted x and y to string s thenm concat them
        System.out.println(x+y +": is my fav num ");// here java added them first then concatendted ti st
        // java evulates from left to right


    }
    /*
STRINGS ARE immutable ie cannot be changed everytime new string is created
    lets say we are in while loop . Where we are using string concatenation. This is where it will keep
    creating new strings which is a bad idea as it is expensive towards the memory and time
    Hence we do this
*/



        public static void string_fix(){
        // we use append
            StringBuilder x = new StringBuilder();
            String input = "XYZ";
            String input1 = "abc";
            x.append(input1);
            x.append(input);
            System.out.println(x);



        }



// an exercise to convert a py to Java




        /*
         from random import choice

secret_num = choice( range( 1, 101 ) )

while True:
    guess = int( input( "What's your guess: " ) )
    if guess < secret_num :
        print( "    ", guess, "is too low" )
    elif guess > secret_num :
        print( "    ", guess, "is too high" )
    else :
        print( "    ", guess, "is correct" )
        break
        * */


    public static void a_func() {

        java.util.Random  val = new Random();
        int secret_num = val.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("What's your guess: ");
            int input = scanner.nextInt();
            if (input == secret_num){
                System.out.println("    "+input+"is correct");
                break;
            }
            else {
                String res = secret_num > input ? "     "+input + " is too high" : "      "+input + " is too low";
                System.out.println(res);
                break;
            }









        }





    }










}








