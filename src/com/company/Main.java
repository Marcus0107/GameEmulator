package com.company;

import com.company.AbstractFactory.ChessFactory;
import com.company.Chess.Chess;
import com.company.Parents.Player;
import com.company.Strategy.HumanPlayerTwo;
import com.company.Visitor.PrintGame;
import com.company.Visitor.PrintVisitor;

public class Main
{

    public static void main(String[] args) throws Exception
    {

        Player one = new Player("Marcus", 1);
        Player two = new Player("Patrick", 2);
        //Es gibt später ein kleines Menu, in dem das spiel ausgewählt werden kann
        ChessFactory factory = new ChessFactory();
        Chess chess = (Chess) factory.createGame(one, two, new HumanPlayerTwo());

        //Initale ausgabe des Spielfelds
        PrintVisitor visitor = new PrintGame();
        visitor.PrintChess(chess);
        //Simulation des ersten Zuges, muss natürlich mehrmals ausgeführt werden
        chess.getStrategy().simulatePlayerTwo(chess);

    }
}
