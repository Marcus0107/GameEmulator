package com.company;

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
}
