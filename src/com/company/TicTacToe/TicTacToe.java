package com.company.TicTacToe;

import com.company.Figure;
import com.company.Builder.Game;
import com.company.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class TicTacToe extends Game {
    final Figure x = new Figure("X");
    final Figure o = new Figure("O");
    Player one;
    Player two;

    public TicTacToe(String name, Player one, Player two, int bettingPot) {
        super(name, one, two, bettingPot);
    }


    @Override
    public void doMove(String move) {

    }
}
