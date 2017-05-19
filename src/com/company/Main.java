package com.company;

import com.company.Builder.ChessBuilder;
import com.company.Chess.Chess;
import com.company.Strategy.HumanPlayerTwo;
import com.company.Visitor.PrintGame;
import com.company.Visitor.PrintVisitor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
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

        PrintVisitor visitor = new PrintGame();
        chessGame.accept(visitor);

        while (true) {


            if (chessGame.isWhiteToMove()) {
                chessGame.doMove(chessGame.getMove());
            } else {
                chessGame.getStrategy().simulatePlayerTwo(chessGame);
            }
            chessGame.accept(visitor);
        }
    }
}
