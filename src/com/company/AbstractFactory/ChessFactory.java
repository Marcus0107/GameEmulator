package com.company.AbstractFactory;

import com.company.Figure;
import com.company.Game;

/**
 * Created by Marcus on 29.04.2017.
 */
public class ChessFactory implements GameFactory {
    Game game;
    Figure[][] board = new Figure[8][8];

    @Override
    public Game createGame(Game game) {

        //Schwarz
        putFigure(0, 0, "t");
        putFigure(0, 1, "s");
        putFigure(0, 2, "l");
        putFigure(0, 3, "d");
        putFigure(0, 4, "k");
        putFigure(0, 5, "l");
        putFigure(0, 6, "s");
        putFigure(0, 7, "t");

        //Weis
        putFigure(7, 0, "T");
        putFigure(7, 1, "S");
        putFigure(7, 2, "L");
        putFigure(7, 3, "D");
        putFigure(7, 4, "K");
        putFigure(7, 5, "L");
        putFigure(7, 6, "S");
        putFigure(7, 7, "T");

        for (int i = 0; i <7 ; i++) {
            putFigure(1,i,"b");

            putFigure(6,i,"B");
        }


        return  Chess(board,game.) ;
    }

    public void putFigure(int pos1, int pos2, String representation) {
        board[pos1][pos2] = new Figure(representation);
    }


}
