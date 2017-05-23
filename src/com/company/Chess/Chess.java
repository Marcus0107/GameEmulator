package com.company.Chess;

import com.company.Parents.Figure;
import com.company.Parents.Game;
import com.company.Parents.Player;
import com.company.Strategy.ComputePlayerTwo;
import com.company.Visitor.Interfaces.LegalMoveVisitor;
import com.company.Visitor.Interfaces.PrintVisitor;
import com.company.Visitor.Interfaces.Visitor;
import com.company.Visitor.Interfaces.WinRateVisitor;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 29.04.2017.
 */

public class Chess extends Game implements Visitor
{
    final private HashMap<String, Integer> boardLetter;
    final private ComputePlayerTwo strategy;
    final private Figure[][] board;
    private boolean whiteToMove = true;
    private List<String> moves = new LinkedList<String>();


    public Chess(String name, Figure[][] board, Player one, Player two, int bettingPot, ComputePlayerTwo strategy)
    {
        super(name, one, two, bettingPot);
        this.boardLetter = getBoardLetter();
        this.strategy = strategy;
        this.board = board;
    }


    public boolean isWhiteToMove()
    {
        return whiteToMove;
    }

    public ComputePlayerTwo getStrategy()
    {
        return strategy;
    }

    @Override
    public void doMove(String move)
    {
        String moveToDo = move;
        if (move == "")
        {
            moveToDo = "SH2 SF1";
        }

        String oldPosition = moveToDo.split(" ")[0];
        String newPosition = moveToDo.split(" ")[1];
        String figure = charToString(newPosition.toCharArray()[0]);

        String horOld = charToString(oldPosition.toCharArray()[1]);
        int horizontalOld = boardLetter.get(horOld);
        int verticalOld = Integer.parseInt(charToString(oldPosition.toCharArray()[2]));

        String horNew = Character.toString(newPosition.toCharArray()[1]);
        int horizontalNew = boardLetter.get(horNew);
        int verticalNew = Integer.parseInt(charToString(newPosition.toCharArray()[2]));
        System.out.println("Horizontal new " + horizontalNew + "Vertical new " + verticalNew);
        setBoard(horizontalOld, verticalOld, "");
        setBoard(horizontalNew, verticalNew, figure);

        if (whiteToMove)
        {
            whiteToMove = false;
        }
        else
        {
            whiteToMove = true;
        }
        moves.add(move);
    }

    public void setBoard(int horizontal, int vertical, String figure)
    {
        board[vertical][horizontal] = new Figure(figure);
    }

    public Figure[][] getBoard()
    {
        return board;
    }

    public List<String> getMoves()
    {
        return moves;
    }

    private String charToString(char character)
    {
        return Character.toString(character);
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

    @Override
    public void accept(PrintVisitor printVisitor)
    {
        printVisitor.accept(this);
    }

    @Override
    public void accept(WinRateVisitor winRateVisitor)
    {
        winRateVisitor.accept(this);
    }

    @Override
    public void accept(LegalMoveVisitor legalMoveVisitor)
    {
        legalMoveVisitor.accept(this);
    }
}

