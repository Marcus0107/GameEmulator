package com.company.Strategy;

import com.company.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcus on 05.05.2017.
 */
public class HumanPlayerTwo implements ComputePlayerTwo {

    @Override
    public void simulatePlayerTwo(Game game) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String move = br.readLine();

        game.doMove(move);

    }
}
