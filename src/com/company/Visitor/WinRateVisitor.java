package com.company.Visitor;

import com.company.Parents.Game;

/**
 * Created by Marcus on 05.05.2017.
 */
public  interface WinRateVisitor
{
     String winrate(Game game);
}
