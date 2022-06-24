package week2_ClosestPair;

import static week2_ClosestPair.ClosestPair.closestHelper;

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
         float ans = closestHelper(P,P.length);
         System.out.print("The smallest distance is ");
         System.out.println(String.format("%.4f",ans));
    }
}

