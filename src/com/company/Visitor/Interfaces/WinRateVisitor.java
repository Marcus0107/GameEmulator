package com.company.Visitor.Interfaces;


import com.company.Chess.Chess;
import com.company.Parents.*;

/**
 * Created by Marcus on 05.05.2017.
 */
public  interface WinRateVisitor
{
     String accept(Chess chess);
}
