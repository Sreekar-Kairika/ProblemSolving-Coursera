package week2_ClosestPair;

import java.util.Comparator;
class PointYComparator implements Comparator<Point> {
    public int compare(Point pointA, Point pointB) {
        return Integer.compare(pointA.y, pointB.y);
    }
}