package com.company.Visitor.Interfaces;

import com.company.Chess.Chess;

/**
 * Created by Marcus on 19.05.2017.
 */
public interface LegalMoveVisitor
{

    void accept(Chess chess);
}
