package com.company.Builder;


import com.company.Parents.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcus on 29.04.2017.
 */
public class Game {
    final String name;
    final Player one;
    final Player two;

    final int bettingPot;

    public Game(String name, Player one, Player two, int bettingPot) {
        this.name = name;
        this.one = one;
        this.two = two;
        this.bettingPot = bettingPot;
    }

    public String getName() {
        return name;
    }
    public Player getOne() {
        return one;
    }

    public Player getTwo() {
        return two;
    }

    public void doMove(String move) {

    }
    public String getMove() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }

}
