package com.company;

import com.company.Builder.ChessBuilder;
import com.company.Chess.Chess;
import com.company.Parents.Player;
import com.company.Strategy.EasyPlayerTwo;
import com.company.Strategy.HumanPlayerTwo;
import com.company.Visitor.PrintGame;
import com.company.Visitor.Interfaces.PrintVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose Game:\n chess");
        String game = br.readLine();
        switch (game)
        {
            case "chess":
                ChessBuilder chessBuilder = new ChessBuilder();
                chessBuilder.setName("Chess");

                System.out.println("Choose strategy:\n p for player vs player\n e for easy computer\n h for hard computer (not implemented)");
                //region set strategy
                String strategy = br.readLine();
                Player one = new Player();
                switch (strategy)
                {
                    case "p":
                        chessBuilder.setStratey(new HumanPlayerTwo());

                        Player two = new Player();
                        chessBuilder.setOne(one);
                        chessBuilder.setTwo(two);
                        chessBuilder.setBettingPot(one.getBetAsCents() + two.getBetAsCents());
                    case "e":
                        chessBuilder.setStratey(new EasyPlayerTwo());
                        chessBuilder.setOne(one);
                        chessBuilder.setBettingPot(one.getBetAsCents() * 2);
                }
                //endregion

                Chess chessGame = chessBuilder.createChess();

                PrintVisitor visitor = new PrintGame();
                chessGame.accept(visitor);

                //region Game
                boolean gameIsRunning = true;
                while (gameIsRunning)
                {
                    String move = "";
                    if (chessGame.isWhiteToMove())
                    {
                        move = chessGame.getMove();
                    }
                    else
                    {
                        move = chessGame.getStrategy().simulatePlayerTwo(chessGame);
                    }

                    if (move == "Chek Mate")
                    {
                        System.out.println(move);
                        chessGame.accept(visitor);
                        break;
                    }
                    chessGame.doMove(move);
                    chessGame.accept(visitor);

                }
                //endregion
        }
    }
}