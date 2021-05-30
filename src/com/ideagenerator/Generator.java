package com.ideagenerator;

import java.util.Random;
import java.util.ArrayList;


/**
 * The generator class helps generate the random sentences that will be given to
 * the user to draw. Currently has one type of prompt. Room for expansion to add more.
 *
 * @author Randi
 */
public class Generator {
    public List list = new List();

    public Generator() {

    }

    /**
     * This method will generate a random drawing sentence for the user
     * @return constructed sentence drawing prompt
     */
    public String generate() {
        String sentence;

        sentence = "Illustrate a " + list.getAdjective() + " " + list.getNoun() + " in " + list.getPlace() + ".";

        return sentence;
    }
}
