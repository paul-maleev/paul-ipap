import java.util.Scanner;

public class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public void setX (double x) {
        this.x = x;
    }

    public double getY () {
        return y;
    }

    public void setY (double y) {
        this.y = y;
    }

    public void setCoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinate the dot");
        this.x = sc.nextDouble();
        System.out.println("Enter Y coordinate the dot");
        this.y = sc.nextDouble();
    }

    @Override
    public String toString () {
        return "X= "+this.getX()+" Y= "+this.getY();
    }

    public static double findDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getY()-b.getY()),2)+Math.pow((a.getX()-b.getX()),2));
    }

}
