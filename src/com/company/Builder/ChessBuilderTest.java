package com.company.Builder;

import com.company.Chess.Chess;
import com.company.Figure;
import com.company.Player;
import com.company.Strategy.HumanPlayerTwo;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marcus on 16.05.2017.
 */
public class ChessBuilderTest {
    @Test
    public void createChess() throws Exception {
        ChessBuilder chessBuilder = new ChessBuilder();

        //Read Bet from player one
        //Example 10€
        Player one = new Player("Marcus", 1000);
        Player two = new Player("Andreas", 1000);
        chessBuilder.setBettingPot(one.getBetAsCents() + two.getBetAsCents());
        chessBuilder.setName("Chess");
        chessBuilder.setOne(one);
        chessBuilder.setTwo(two);
        chessBuilder.setStratey(new HumanPlayerTwo());

        Chess chessGame = chessBuilder.createChess();

        if (chessGame.isWhiteToMove()) {
            chessGame.doMove(chessGame.getMove());
        } else {
            chessGame.getStrategy().simulatePlayerTwo(chessGame);
        }


    }

}