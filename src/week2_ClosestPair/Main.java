package week2_ClosestPair;


import java.text.DecimalFormat;

import static week2_ClosestPair.ClosestPair.closest;

class Point{
    public int x;
    public int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args){
        Point[] P = new Point[]{
                new Point(2, 3),
                new Point(12, 30),
                new Point(40, 50),
                new Point(5, 1),
                new Point(12, 10),
                new Point(3, 4)

        };

        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println("The smallest distance is " + closest(P,P.length));
    }
}

