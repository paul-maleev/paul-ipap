public class BoltsAndNuts {
    public static void main (String[] args) {

        int k1 = 1000; // начальное число болтов
        int l1 = 10; // процент потерянных деталей
        int m1 = 100; // стоимость одного болта

        int k2 = 1200; // начальное число гаек
        int l2 = 20; // процент потерянных деталей
        int m2 = 90; // стоимость одной гайки


        int a = (k1 * l1) / 100;
        System.out.println(a);
        int a1 = (k2 * l2) / 100;
        System.out.println(a1);

        int s = a * m1 + a1 * m2;
        System.out.println(s);
        int r1 = k1 - a;
        int r2 = k2 - a1;
        if (r1 > r2) {
            s += (r1 - r2) * m1;
        } else {
            s += (r2 - r1) * m2;
        }
        System.out.println(s);

    }
}
