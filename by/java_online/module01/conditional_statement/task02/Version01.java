/*
 * Найти max{min(a, b), min(c, d)}.
 */

package by.java_online.module01.conditional_statement.task02;

public class Version01 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double min1;
        double min2;

        a = 10.5;
        b = 1.7;
        c = 1.9;
        d = 5.5;

        // Минимальное значение в первой паре чисел
        if (a >= b) {
            min1 = b;
        } else {
            min1 = a;
        }

        // Минимальное значение во второй паре чисел
        if (c >= d) {
            min2 = d;
        } else {
            min2 = c;
        }

        // Максимальное значение среди двух минимальных
        if (min1 > min2){
            System.out.println("Maximum value: " + min1);
        } else if (min1 < min2){
            System.out.println("Maximum value: " + min2);
        } else{
            System.out.println("Minimum values are equal: " + min1);
        }
    }
}
