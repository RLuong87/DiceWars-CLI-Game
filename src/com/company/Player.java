package com.company;

import java.util.ArrayList;

public class Player {

    public ArrayList<Die> playersDice;
    private final String name;

    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
