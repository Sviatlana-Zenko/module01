/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, x > 2
 * y = -x, x <= 2
 */

package by.java_online.module01.cycle.task02;

public class Task02 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double y;

        a = -5.5;
        b = 3.5;
        h = 0.5;

        // Шаг не должен быть отрицательным или равным нулю
        if (h <= 0) {
            System.out.println("'h' can't be negative or equal to zero.");
            return;
        }

        while (a <= b) {

            if (a <= 2 & a != 0) { //a != 0 введено, чтобы выводило y = 0.0, а не y = -0.0
                y = -a;
            } else {
                y = a;
            }

            a += h;

            System.out.println("y = " + y);
        }
    }
}
