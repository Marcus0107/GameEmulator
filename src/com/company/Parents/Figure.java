package com.company.Parents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcus on 29.04.2017.
 */
public class Figure {
    final String displayRepresentation;

    public Figure(String displayRepresentation) {
        this.displayRepresentation = displayRepresentation;
    }

    @Override
    public String toString() {
        return displayRepresentation;
    }

    public String getDisplayRepresentation()
    {
        return displayRepresentation;
    }

    /**
     * Created by Marcus on 29.04.2017.
     */

}
