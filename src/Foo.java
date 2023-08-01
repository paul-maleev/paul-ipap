import java.util.Arrays;
import java.util.Scanner;

public class Foo {
    public static void main (String[] args) {
        int m[] = {1, 3 , 5};
        System.out.println(Arrays.toString(m));
        int x =12;
        double y=x/5;
        int i=x-1;
        Scanner sc = new Scanner(System.in);
        while(i>y) {
            System.out.println("i equals "+i);
            i=i-2;

        }

        x = 12;
        y=x/5;
        int z=x-4;
        i=0;

        while (z<10) {
            i=z/2;
            //System.out.println("z = "+z);
            while (i>=y)
            {
                System.out.println("i равно "+i);
                i=i+1;
                y=y+1.5;
            }

        }
    }
}
