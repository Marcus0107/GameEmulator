package com.company.Strategy;

import com.company.Builder.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcus on 05.05.2017.
 */
public class HumanPlayerTwo implements ComputePlayerTwo {

    @Override
    public String simulatePlayerTwo(Game game) throws IOException {
        System.out.println("Waiting for other player to do his move");
        String move = game.getMove();

        return  move;
    }

}
