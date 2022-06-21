package katas.manhattan_distance;

public class Main {

    public static void main(String[] args) {

        Point3D p = new Point3D(6, 1, 4);
        Point3D q = new Point3D(2, 5, 4);

        int distance = ManhattanDistance.manhattanDistance(p, q);

        System.out.println("Manhattan Distance is " + distance);
    }
}
