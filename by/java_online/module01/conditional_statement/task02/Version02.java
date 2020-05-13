/*
 * Найти max{min(a, b), min(c, d)}.
 */

package by.java_online.module01.conditional_statement.task02;

public class Version02 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double min1;
        double min2;
        double max;

        a = 10.5;
        b = -5.5;
        c = 1.9;
        d = 1.01;

        min1 = (a >= b) ? b : a;
        min2 = (c >= d) ? d : c;
        max = (min1 >= min2) ? min1 : min2;

        System.out.println("Maximum value: " + max);
    }
}
