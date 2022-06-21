package katas.manhattan_distance;

public class Point implements L1Distance{

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int manhattanDistance(L1Distance other) {
        if (other instanceof Point) {
            Point otherPt = (Point) other;
            return Math.abs(this.x - otherPt.x) + Math.abs(this.y - otherPt.y);
        }

        throw new RuntimeException("Error calculating the Manhattan Distance");
    }
}
