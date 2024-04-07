/**
 * Точка двумерного пространства
 */
public class Point2D {
    private int valueX;
    private int valueY;

    /**
     * Конструктор точки
     * @param valueX координата по оси X
     * @param valueY координата по оси Y
     */
    public Point2D(int valueX, int valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    /**
     * Конструктор если X=Y
     * @param value значения X и Y
     */
    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getValueX() {
        return valueX;
    }

    public int getValueY() {
        return valueY;
    }

    public void setValueX(int valueX) {
        this.valueX = valueX;
    }

    public void setValueY(int valueY) {
        this.valueY = valueY;
    }

    @Override
    public String toString() {
        return "Point2D (" +
                "X=" + valueX +
                ", Y=" + valueY +
                ')';
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.valueX - b.valueX, 2) + Math.pow(a.valueY - b.valueY, 2));
    }
}
