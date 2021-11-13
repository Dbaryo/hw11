package com.david.model;

public class Point {

    public double x;
    public double y;

    public double euclideanDistanceCalculation (Point a, Point b){
        double squareADiff = ( a.x - b.x ) * ( a.x - b.x );
        double squareBDiff = ( a.y - b.y ) * ( a.y - b.y );
        return Math.sqrt( squareADiff + squareBDiff );

    }

}
