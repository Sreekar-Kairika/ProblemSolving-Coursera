package week2_ClosestPair;

import java.util.Comparator;
public class PointXComparator implements Comparator<Point> {
    @Override
    public  int compare(Point pointA, Point pointB) {
        return Integer.compare(pointA.x, pointB.x);
    }
}