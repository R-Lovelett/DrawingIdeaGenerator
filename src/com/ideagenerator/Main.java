package com.ideagenerator;

import java.util.Scanner;

public class Main {

    public static boolean run = true;
    public static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Drawing Idea Generator: ");

        Generator idea = new Generator();

        while (run == true){
            System.out.println(idea.generate());
            System.out.println("Continue? (y / n)");
            String answer = scr.nextLine();
            if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                run = false;
            }
        }

    }
}
