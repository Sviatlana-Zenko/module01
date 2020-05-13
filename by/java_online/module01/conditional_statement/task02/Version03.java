/*
 * Найти max{min(a, b), min(c, d)}.
 */

package by.java_online.module01.conditional_statement.task02;

public class Version03 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double min1;
        double min2;
        double max;

        a = 10.5;
        b = 1.9;
        c = 1.9;
        d = 2.5;

        min1 = Math.min(a, b);
        min2 = Math.min(c, d);
        max = Math.max(min1, min2);

        System.out.println("Maximum value: " + max);
    }
}
