package com.company.ConnectFour;

import com.company.Figure;
import com.company.Game;
import com.company.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class ConnectFour extends Game {

    public ConnectFour(Figure[][] board, Player one, Player two) {
        super("Connect Four", board, one, two);

    }

    @Override
    public void doMove(String move) {

    }
}
