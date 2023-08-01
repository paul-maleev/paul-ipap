import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleArea {

    public static double inputSide() {
        Scanner n = new Scanner(System.in);
        double s = -1;
        do {
            try {
                System.out.print("Введите значение длинны стороны треугольника: ");
                s = n.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Введено значение неверного типа");
                n.nextLine();
            }
        } while (s < 0);
        return s;
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        double a, b, c;
        a = inputSide();
        b = inputSide();
        c = inputSide();
        System.out.println(triangleArea(a,b,c));
        System.out.println(isTriangle(a,b,c));


    }
}