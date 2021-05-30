package com.ideagenerator;

import java.util.Random;
import java.util.ArrayList;

public class Generator {
    public List list = new List();

    public Generator() {

    }

    public String generate() {
        String sentence = "";

        sentence = "Illustrate a " + list.getAdjective() + " " + list.getNoun() + " in " + list.getPlace() + ".";

        return sentence;
    }
}
