import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static double findDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getY()-b.getY()),2)+Math.pow((a.getX()-b.getX()),2));
    }

    public static void getTwoDots() {
        Point foo = new Point();
        Point bar = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of the first dot ");
        foo.setCoordinates();
        System.out.println("Enter coordinates of the second dot ");
        bar.setCoordinates();
        System.out.println("The distance between these dots is: "+findDistance(foo,bar));
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void getTriangleArea() {

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        System.out.println("Enter coordinates of the first dot");
        a.setCoordinates();
        System.out.println("Enter coordinates of the second dot");
        b.setCoordinates();
        System.out.println("Enter coordinates of the third dot");
        c.setCoordinates();

        double sideA = findDistance(a,b);
        double sideB = findDistance(a,c);
        double sideC = findDistance(b,c);

        if(isTriangle(sideA,sideB,sideC)) {
            double p = (sideA + sideB + sideC) / 2.0;
            double square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            System.out.println("Area of the triangle: " + square);
        } else {
            System.out.println("Invalid triangle!");
        }
    }

    public static void getLargestLineSegment (Point a, Point b, Point c) {
        double lineSegmentA = findDistance(a,b);
        double lineSegmentB = findDistance(a,c);
        double lineSegmentC = findDistance(b,c);
        ArrayList<Double> list = new ArrayList<>();
        list.add(lineSegmentA);
        list.add(lineSegmentB);
        list.add(lineSegmentC);
        System.out.println("Maximum object length: "+ Collections.max(list));

    }

    public static void getTwoClosestPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число точек (от двух): ");
        int n = 2;
        n = sc.nextInt();
        if(n<2) {
            n=2;
        }
        Point points[] = new Point[n];
        for(int i=0;i<n;i++) {
            System.out.println("Введите координаты точки № "+(n+1));
            points[i] = new Point();
            points[i].setCoordinates();

        }



    }

    public static double getAPairOfClosestDots(Point[] P, int n) {
        double min = Double.MAX_VALUE;
        double currMin = 0;
        Point closestA=new Point();
        Point closestB=new Point();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                currMin = findDistance(P[i], P[j]);
                if (currMin < min) {
                    closestA = P[i];
                    closestB = P[j];
                    min = currMin;
                }
            }
        }

        System.out.println("P1 = "+closestA.toString()+" P2 ="+closestB.toString());
        return min;
    }



    public static void main (String[] args) {

        System.out.println("pasha.maleev@gmail.com");
        System.out.println(findDistance(new Point(0,0),new Point(4,3)));
        //getTriangleArea();
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        a.setCoordinates();
        b.setCoordinates();
        c.setCoordinates();
        getLargestLineSegment(a,b,c);
        //getTwoDots();

    }
}
