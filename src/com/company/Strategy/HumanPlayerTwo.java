package com.company.Strategy;

import com.company.Parents.Figure;
import com.company.Parents.Game;

import java.io.IOException;

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
