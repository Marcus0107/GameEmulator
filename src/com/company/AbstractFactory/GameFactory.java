package com.company.AbstractFactory;

import com.company.Game;
import com.company.Player;

/**
 * Created by Marcus on 29.04.2017.
 */
public interface GameFactory {
    Game createGame(Player one, Player two);
}
