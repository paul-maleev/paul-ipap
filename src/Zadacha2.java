import java.util.Scanner;

public class Zadacha2 {
    /**
     * пользователь вводит число n
     * такое количество раз читаются целые числа
     * вывести сумму введенных чисел
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("vvedite chislo n from 1 to 15");
            if (scanner.hasNextInt())
                n = scanner.nextInt();
            else {
                scanner.next();
                n=-999;
            }
        }
        while (n < 1 || n > 15);
        int i = 1;
        int s = 0;
        int x; // каждое новое введенное с консоли число
        while (i <= n) {
            System.out.println("vvedite chislo:");
            x = scanner.nextInt();
            s += x; // s=s+x
            i++;
        }
        System.out.println("sum is "+s);

    }
}

class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite chislo n");
        int n = scanner.nextInt();
        int i = 1;
        double s = 0;
        int x;
        int kPositive = 0; // количество положительных чисел
        while (i <= n) {
            System.out.println("vvedite chislo:");
            x = scanner.nextInt();
            if (x > 0) {
                //s += x; // сумма всех положительных чисел
                s = s + x;
                kPositive++; // kPositive = kPositive+1;
            }
            i++;
        }
        // double avg = ((double)s / kPositive);
        System.out.println(s / kPositive);
    }
}