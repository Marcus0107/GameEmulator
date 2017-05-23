package com.company.Parents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcus on 29.04.2017.
 */
public class Player
{
    final String name;
    final int betAsCents;

    public Player() throws IOException
    {
        name = readName();
        betAsCents = readBet();
    }

    private int readBet() throws IOException
    {
        System.out.println("Place bet for player one");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    private String readName() throws IOException
    {
        System.out.println("Name player");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public String getName()
    {
        return name;
    }

    public int getBetAsCents()
    {
        return betAsCents;
    }
}
