package com.company.Chess;

import com.company.Figure;
import com.company.Game;
import com.company.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class Chess extends Game{

    public Chess(Figure[][] board, Player one, Player two) {
        super("Chess", board,one,two);
    }

    @Override
    public void doMove() {

    }
}
