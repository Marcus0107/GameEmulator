package com.company.Visitor;

import com.company.Chess.Chess;
import com.company.Figure;

/**
 * Created by Marcus on 02.05.2017.
 */
public class PrintGame implements  PrintVisitor {
    @Override
    public void PrintChess(Chess chess) {
        Figure[][] board = chess.getBoard();
        System.out.println("\t-\t-\t-\t-\t-\t-\t-\t-");
        System.out.println("A|\t" + board[0][0] + "\t" + board[1][0]+"\t");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
               // System.out.print(chess.getBoard()[j][i])  ;

            }
        }

    }
}
