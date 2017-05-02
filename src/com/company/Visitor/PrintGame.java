package com.company.Visitor;

import com.company.Chess.Chess;

/**
 * Created by Marcus on 02.05.2017.
 */
public class PrintGame implements  PrintVisitor {
    @Override
    public void PrintChess(Chess chess) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.println(chess.getBoard()[i][j])  ;

            }
        }

    }
}
