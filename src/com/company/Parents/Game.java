package com.company.Parents;

import com.company.Strategy.ComputePlayerTwo;

import java.util.LinkedList;

/**
 * Created by Marcus on 29.04.2017.
 */
public abstract class Game {
    final String name;
    //not final, since it will change during the game often
    Figure[][] board;
    final Player one;
    final Player two;
    LinkedList<Figure[][]> oldPositions;
    final ComputePlayerTwo strategy;

    public Game(String name, Figure[][] board, Player one, Player two, ComputePlayerTwo strategy) {
        this.board = board;
        this.name = name;
        this.one = one;
        this.two = two;
        this.oldPositions = new LinkedList<>();
        this.strategy = strategy;
    }

    public ComputePlayerTwo getStrategy()
    {
        return strategy;
    }

    public String getName() {
        return name;
    }

    public Figure[][] getBoard() {
        return board;
    }

    public Player getOne() {
        return one;
    }

    public Player getTwo() {
        return two;
    }

    public void addOldBoard(Figure[][] board){
        oldPositions.add(board);
    }

    public Figure getFigure( int positionOne, int positionTwo){
     return  this.board[positionOne][positionTwo];
    }
    public void setFigure(Figure figure, int positionOne, int positionTwo)
    {
        this.board[positionOne][positionTwo] = figure;
    }

    public abstract void doMove(String move) throws Exception;
}
