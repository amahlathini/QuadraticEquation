import javax.swing.*;

import static java.lang.Math.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int a, b, c;
        float x1, x2;
        Scanner sc = new Scanner(System.in);



        System.out.print("a: ");
        a =  sc.nextInt();
        System.out.print("b: ");
        b =  sc.nextInt();
        System.out.print("c: ");
        c =  sc.nextInt();

        float underRoot = (float) sqrt((b * b) - (4 * a * c));

        if (underRoot < 0) {

            System.out.println("x is undefined");
        }
        else {


            x1 = (float) (((-b) + (underRoot)) / (2 * a));
            x2 = (float) (((-b) - (underRoot)) / (2 * a));

            if (x1 == x2) {

                System.out.printf("x = %.0f\n", x1);

            }

            else {
                System.out.printf("x = %.2f or  x = %.2f\n", x1, x2);
            }



        }

    }
}