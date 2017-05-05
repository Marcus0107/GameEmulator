package com.company.AbstractFactory;

import com.company.Parents.Game;
import com.company.Parents.Player;
import com.company.Strategy.ComputePlayerTwo;

/**
 * Created by Marcus on 29.04.2017.
 */
public interface GameFactory {
    Game createGame(Player one, Player two,ComputePlayerTwo strategy);
}
