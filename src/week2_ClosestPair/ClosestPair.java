package week2_ClosestPair;

import java.util.Arrays;
public class ClosestPair {
    // Distance between two points
    public static float distance(Point p1,Point p2){
        return (float) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
                (p1.y - p2.y) * (p1.y - p2.y)
        );
    }

    // If there are less than 3 points we use the Brute Force Approach
    public static float bruteForce(Point[] P, int n) {
        float min = Float.MAX_VALUE;
        float currMin = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                currMin = distance(P[i], P[j]);
                if (currMin < min) {
                    min = currMin;
                }
            }
        }
        return min;
    }

    //This loop runs a maximum of 6 times , its time complexity is O(n)
    public static float stripClosest(Point[] strip, int size, float d) {
        float min = d; // Initialize the minimum distance as d

        Arrays.sort(strip, 0, size, new PointYComparator());
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size && (strip[j].y - strip[i].y) < min; ++j) {
                if (distance(strip[i], strip[j]) < min) {
                    min = distance(strip[i], strip[j]);
                }
            }
        }
        return min;
    }
    public static float closestUtil(Point[] P,int startIndex, int endIndex)
    {
        if ((endIndex - startIndex) <= 3) {
            return bruteForce(P, endIndex);
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        Point midPoint = P[mid];

        float dl = closestUtil(P, startIndex, mid);
        float dr = closestUtil(P, mid, endIndex);

        float d = Math.min(dl, dr);

        Point[] strip = new Point[endIndex];
        int j = 0;
        for (int i = 0; i < endIndex; i++) {
            if (Math.abs(P[i].x - midPoint.x) < d) {
                strip[j] = P[i];
                j++;
            }
        }
        return Math.min(d, stripClosest(strip, j, d));
    }

    public static float closest(Point[] P, int n) {
        Arrays.sort(P, 0, n, new PointXComparator());
        return closestUtil(P, 0, n);
    }

}
