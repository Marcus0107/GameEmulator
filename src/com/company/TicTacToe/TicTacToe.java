package com.company.TicTacToe;

import com.company.Parents.Figure;
import com.company.Parents.Game;
import com.company.Parents.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public class TicTacToe extends Game {
    final Figure x = new Figure("X");
    final Figure o = new Figure("O");
    Player one;
    Player two;

    public TicTacToe(Figure[][] board, String name, Player one, Player two) {
        super("Tic Tac Toe",board,one,two,null);
       /* super("Tic Tac Toe", one,two); */
        this.one = one;
        this.two = two;
    }

    @Override
    public void doMove(String move) {

    }
}
