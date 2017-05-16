package com.company.Parents;

/**
 * Created by Marcus on 29.04.2017.
 */
public class Player {
    final String name;
    final int betAsCents;

    public Player(String name, int bet) {
        this.name = name;
        betAsCents = bet;
    }

    public String getName() {
        return name;
    }

    public int getBetAsCents() {
        return betAsCents;
    }
}
