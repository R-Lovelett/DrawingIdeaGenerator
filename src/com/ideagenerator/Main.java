package com.ideagenerator;

import java.util.Scanner;

/**
 * The main executing program, will repeatedly ask to continue printing out
 * drawing prompts until user says to stop.
 *
 * @author Randi
 */
public class Main {

    public static boolean run = true; //boolean that affects the main executing loop
    public static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Drawing Idea Generator: ");

        Generator idea = new Generator(); //the prompt generator

        while (run){ //as long as true, generate a random prompt and ask if should continue
            System.out.println(idea.generate());
            System.out.println("Continue? (y / n)");
            String answer = scr.nextLine();
            if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {//if user says to stop, change run boolean to exit program
                run = false;
            }
        }

    }
}
