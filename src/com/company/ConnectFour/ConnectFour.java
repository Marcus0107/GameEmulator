package com.company.ConnectFour;

import com.company.Parents.Figure;
import com.company.Parents.Game;
import com.company.Parents.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class ConnectFour extends Game {

    public ConnectFour(Figure[][] board, Player one, Player two) {
        super("Connect Four", board, one, two,null);

    }

    @Override
    public void doMove(String move) {

    }
}
