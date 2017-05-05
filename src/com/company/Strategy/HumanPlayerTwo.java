package com.company.Strategy;

import com.company.Parents.Game;

/**
 * Created by Marcus on 05.05.2017.
 */
public class HumanPlayerTwo implements ComputePlayerTwo
{

    @Override
    public void simulatePlayerTwo(Game game) throws Exception
    {

        System.out.println();
        System.out.println();
        System.out.println("Input move");
        System.out.println();
        System.out.println();
        //Scanner scanner = new Scanner(System.in);
        //String move = scanner.nextLine();
        //game.doMove(move);
        game.doMove("SH8 SH3");

    }
}
