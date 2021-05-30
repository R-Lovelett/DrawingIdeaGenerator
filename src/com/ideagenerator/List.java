package com.ideagenerator;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class List {

    public Random rand = new Random();

    public ArrayList<String> adjectives = new ArrayList<>(Arrays.asList("happy", "sad",
            "colorful", "beautiful", "undead", "tired", "muscular", "unkept", "brave", "zen", "fierce",
            "scary", "ancient", "old-fashioned", "young", "sharp", "evil", "fragile", "hungry", "puzzled",
            "shiny", "wicked", "worrisome", "confident", "angry", "dark", "defiant", "gentle", "heroic", "magnificent", "scared"));

    public ArrayList<String> nouns = new ArrayList<>(Arrays.asList("man", "woman",
            "human", "skeleton", "parrot", "hamster", "wolf", "dog", "cat", "whale", "robot", "chef", "bartender",
            "pirate", "superhero", "astronaut", "snake", "dinosaur", "mouse", "cowboy", "eskimo", "fairy", "goblin",
            "alien", "ghost", "turtle", "ninja", "hacker", "bunny", "genie", "soldier"));

    public ArrayList<String> places = new ArrayList<>(Arrays.asList("Rome", "Paris",
            "a beach", "the woods", "an office", "Yellowstone", "space", "dog park", "the ocean", "a plane",
            "China", "Japan", "Comic Con", "a graveyard", "ruined city", "Egypt", "New York", "Miami", "Alaska", "the Amazon",
            "a mushroom forest", "the Lost Woods", "a church", "a ship", "the desert", "a cafe", "the outback", "the Great Barrier Reef",
            "Dubai", "London", "the Great Plains"));

    public List() {
    }

    public String getAdjective() {
        int size = adjectives.size();
        int index = rand.nextInt(size);
        return adjectives.get(index);
    }

    public String getNoun() {
        int size = nouns.size();
        int index = rand.nextInt(size);
        return nouns.get(index);
    }

    public String getPlace() {
        int size = places.size();
        int index = rand.nextInt(size);
        return places.get(index);
    }
}
