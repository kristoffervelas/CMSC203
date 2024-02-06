/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: Color guessing game
 * Due: Feb 7, 2024
 * Platform/Compiler: VSCode
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Kristoffer Velas
 */

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ESPGame{
    public static void main(String[] args){
        //string literals
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final String COLOR_BROWN = "Brown";
        final String COLOR_PURPLE = "Purple";

        //get info
        Scanner namescan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = namescan.nextLine();

        Scanner mcscan = new Scanner(System.in);
        System.out.print("Enter your MC#: ");
        String mc = mcscan.nextLine();

        Scanner infoscan = new Scanner(System.in);
        System.out.print("Describe yourself: ");
        String info = infoscan.nextLine();

        Scanner duescan = new Scanner(System.in);
        System.out.print("Due Date: ");
        String due = duescan.nextLine();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int counter = 0;
        for(int i = 1; i <= 11; i++){
            //initialize random color
            String color = "";
            Random randObj = new Random();
            int rand = randObj.nextInt(7);
            if(rand == 0){
                color = COLOR_RED;
            }else if(rand == 1){
                color = COLOR_GREEN;
            }else if(rand == 2){
                color = COLOR_BLUE;
            }else if(rand == 3){
                color = COLOR_ORANGE;
            }else if(rand == 4){
                color = COLOR_YELLOW;
            }else if(rand == 5){
                color = COLOR_BROWN;
            }else if(rand == 6){
                color = COLOR_PURPLE;
            }else{
                color = COLOR_RED;
            }

            System.out.println("Round " + i + "\n");
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Brown, or Purple?");
            Scanner guessScan = new Scanner(System.in);
            System.out.println("Enter your guess:");
            String guess1 = guessScan.nextLine();
            String guess = guess1.substring(0, 1).toUpperCase() + guess1.substring(1);

            if(guess.equals(color)){
                //meaning the guess is right
                counter++;
                System.out.println("I was thinking of " + color+"\n");
                System.out.println(guess);
            }else{
                //guess was wrong
                System.out.println("You entered the incorrect color.\n");
                System.out.println("I was thinking of " + color+"\n");
                System.out.println(guess);
            }

        }
        System.out.println("Game Over");
        System.out.println("You guessed "+counter+" out of 11 colors correctly.");
        System.out.println("Student Name: "+name);
        System.out.println("MC#: "+mc);
        System.out.println("User Description: "+info);
        System.out.println("Due Date: "+due);
    }
}
