package com.company.AbstractFactory;

import com.company.Game;

/**
 * Created by Marcus on 29.04.2017.
 */
public interface GameFactory {
    Game createGame(Game game);
}
