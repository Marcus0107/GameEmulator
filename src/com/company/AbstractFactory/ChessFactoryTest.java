package com.company.AbstractFactory;

import com.company.Chess.Chess;
import com.company.Game;
import com.company.Player;
import com.company.Visitor.PrintGame;
import com.company.Visitor.PrintVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Marcus on 02.05.2017.
 */
class ChessFactoryTest {
    @Test
    void putFigure() {
        Player one = new Player("Marcus",1);
        Player two =  new Player("Patrick",2);
        ChessFactory factory = new ChessFactory();
        Chess chess = (Chess) factory.createGame(one,two);

        PrintVisitor visitor = new PrintGame();
        visitor.PrintChess(chess);
    }

}