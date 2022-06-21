package katas.manhattan_distance;

public class Point3D implements L1Distance{

    private int x;
    private int y;
    private int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int manhattanDistance(L1Distance other) {
        if (other instanceof Point3D) {
            Point3D otherPt = (Point3D) other;
            return Math.abs(this.x - otherPt.x) + Math.abs(this.y - otherPt.y) + Math.abs(this.z - otherPt.z);
        }

        throw new RuntimeException("Error calculating the Manhattan Distance");
    }
}
