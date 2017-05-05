package com.company.Chess;

import com.company.Parents.Figure;
import com.company.Parents.Game;
import com.company.Parents.Player;
import com.company.Strategy.ComputePlayerTwo;
import com.company.Visitor.PrintGame;
import com.company.Visitor.PrintVisitor;

import java.util.HashMap;

/**
 * Created by Marcus on 29.04.2017.
 */

public class Chess extends Game
{
    private final HashMap<String, Integer> boardLetter;


    public Chess(Figure[][] board, Player one, Player two, ComputePlayerTwo strategy)
    {
        super("Chess", board, one, two, strategy);
        boardLetter = getBoardLetter();
    }

    @Override
    public void doMove(String move) throws Exception
    {
        String oldPosition = move.split(" ")[0];
        String newPosition = move.split(" ")[1];

        String oldBoardLetter = Character.toString(oldPosition.toCharArray()[1]);
        int horizontalOld = boardLetter.get(oldBoardLetter);
        int verticalOld = Integer.parseInt(Character.toString(oldPosition.toCharArray()[2]));

        String newBoardLetter = Character.toString(newPosition.toCharArray()[1]);
        int horizontalNew = boardLetter.get(newBoardLetter);
        int verticalNew = Integer.parseInt(Character.toString(newPosition.toCharArray()[2]));

        Figure[][] board = this.getBoard();
        boolean isSameFigure = board[horizontalOld-1][verticalOld-1].getDisplayRepresentation().equals(Character.toString(oldPosition.toCharArray()[0]));
        if (isSameFigure)
        {
            this.setFigure(getFigure(horizontalOld-1, verticalOld-1), horizontalNew-1, verticalNew-1);
            this.setFigure(new Figure(""), horizontalOld-1, verticalOld-1);
            PrintVisitor visitor = new PrintGame();
            visitor.PrintChess(this);
        }
        else
        {
            throw new Exception("There is a wrong figure at that position");
        }


    }

    private HashMap<String, Integer> getBoardLetter()
    {
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

