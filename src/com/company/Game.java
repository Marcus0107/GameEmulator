package com.company;

/**
 * Created by Marcus on 29.04.2017.
 */
public abstract class Game {
    final String name;
    final Figure[][] board;
    final Player one;
    final Player two;

    public Game(String name, Figure[][] board, Player one, Player two) {
        this.board = board;
        this.name = name;
        this.one = one;
        this.two = two;
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

    public abstract void doMove(String move);
}
