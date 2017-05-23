package com.company.Builder;

import com.company.Chess.Chess;
import com.company.Parents.Figure;
import com.company.Parents.Player;
import com.company.Strategy.ComputePlayerTwo;

/**
 * Created by Marcus on 16.05.2017.
 */
public class ChessBuilder {
    private String name;
    private Figure[][] board;
    private Player one;
    private Player two;
    private int bettingPot;
    private ComputePlayerTwo stratey;

    public ChessBuilder() {
        board = new Figure[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Figure("");
            }
        }
        //region put figure
        //Weis
        putFigure(0, 0, "t");
        putFigure(0, 1, "s");
        putFigure(0, 2, "l");
        putFigure(0, 3, "d");
        putFigure(0, 4, "k");
        putFigure(0, 5, "l");
        putFigure(0, 6, "s");
        putFigure(0, 7, "t");

        //Schwarz
        putFigure(7, 0, "T");
        putFigure(7, 1, "S");
        putFigure(7, 2, "L");
        putFigure(7, 3, "D");
        putFigure(7, 4, "K");
        putFigure(7, 5, "L");
        putFigure(7, 6, "S");
        putFigure(7, 7, "T");
        //endregion
        for (int i = 0; i < 8; i++) {
            putFigure(1, i, "b");
            putFigure(6, i, "B");
        }

    }

    public void setName(String name) {
        this.name = name;
    }



    public void setOne(Player one) {
        this.one = one;
    }

    public void setTwo(Player two) {
        this.two = two;
    }

    public void setBettingPot(int bettingPot) {
        this.bettingPot = bettingPot;
    }

    public void setStratey(ComputePlayerTwo stratey) {
        this.stratey = stratey;
    }

    public Chess createChess() {
        return new Chess(name,board,one,two,bettingPot,stratey);
    }

    private void putFigure(int horizontal, int vertical, String representation) {

        board[vertical][horizontal] = new Figure(representation);
    }

}
