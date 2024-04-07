

public class Main {

    public static void main(String[] args) {
        Point2D a = new Point2D(3, 4);
        // Point2D a = new Point2D(0, 2);
        System.out.println(a.getValueX());
        System.out.println(a.getValueY());
        Point2D b = new Point2D(0);
        System.out.println(b);
        //Point2D b = new Point2D(0, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}