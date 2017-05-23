package com.company.Visitor.Interfaces;

import com.company.Chess.Chess;

/**
 * Created by Marcus on 02.05.2017.
 */
public interface PrintVisitor {
    void accept(Chess chess);
}
