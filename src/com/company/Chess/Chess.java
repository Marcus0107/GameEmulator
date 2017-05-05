package com.company.Chess;

import com.company.Figure;
import com.company.Game;
import com.company.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcus on 29.04.2017.
 */

public class Chess extends Game {
    private HashMap<String, Integer> boardLetter;


    public Chess(Figure[][] board, Player one, Player two) {
        super("Chess", board, one, two);
        boardLetter = getBoardLetter();
    }

    @Override
    public void doMove(String move) {
        String oldPosition = move.split(" ")[0];
        String newPosition = move.split(" ")[1];

        int horizontalOld = boardLetter.get(oldPosition.toCharArray()[2]);
        int verticalOld = (int)oldPosition.toCharArray()[3];

        int horizontalNew = boardLetter.get(newPosition.toCharArray()[2]);
        int verticalNew = (int)newPosition.toCharArray()[3];




    }

    private HashMap<String, Integer> getBoardLetter() {
        HashMap<String, Integer> boarLetters = new HashMap<String, Integer>();

        boarLetters.put("A", 0);
        boarLetters.put("B", 1);
        boarLetters.put("C", 2);
        boarLetters.put("D", 3);
        boarLetters.put("E", 4);
        boarLetters.put("F", 5);
        boarLetters.put("G", 6);
        boarLetters.put("H", 7);
        return boarLetters;


    }
}

