package com.company.Visitor;

import com.company.Chess.Chess;
import com.company.Parents.Figure;
import com.company.Visitor.Interfaces.PrintVisitor;

/**
 * Created by Marcus on 02.05.2017.
 */
public class PrintGame implements PrintVisitor
{
    @Override
    public void accept(Chess chess) {
        Figure[][] board = chess.getBoard();
        String[] lettrs = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println("\t-\t\t-\t\t-\t\t-\t\t-\t\t-\t\t-\t\t-");
        for (int i = 0; i < 8; i++) {
            System.out.print(lettrs[i] + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print("\t" + board[j][i] + "\t|");
            }
            System.out.println();
            System.out.println("\t-\t\t-\t\t-\t\t-\t\t-\t\t-\t\t-\t\t-");
        }
        System.out.println("\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7\t\t8");
        System.out.println();
    }


}
