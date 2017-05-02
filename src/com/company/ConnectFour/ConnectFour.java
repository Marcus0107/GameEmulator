package com.company.ConnectFour;

import com.company.Figure;
import com.company.Game;
import com.company.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class ConnectFour extends Game {
    Figure colorOne;
    Figure colorTwo;


    public ConnectFour(Figure[][] board,Figure colorOne, Figure colorTwo) {
        super("Connect Four",board);
        this.colorOne = colorOne;
        this.colorTwo = colorTwo;
    }

    @Override
    public void doMove() {

    }
}
