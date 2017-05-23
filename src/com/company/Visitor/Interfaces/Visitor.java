package com.company.Visitor.Interfaces;

/**
 * Created by Marcus on 02.05.2017.
 */
public interface Visitor {
    void accept(PrintVisitor printVisitor);
    void accept(WinRateVisitor winRateVisitor);
    void accept(LegalMoveVisitor legalMoveVisitor);
}
