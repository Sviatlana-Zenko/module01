/*
 * Даны числовой ряд ([x; y]) и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид:
 * a(n) = 1/2^n + 1/3^n
 */

package by.java_online.module01.cycle.task05;

public class Task05 {
    public static void main(String[] args) {
        int x;
        int y;
        double e;
        double sum;

        x = 1;
        y = 5;
        e = 0.5;
        sum = 0;

        while (x <= y) {
            double a;
            a = 1 / Math.pow(2, x) + 1 / Math.pow(3, x);

            if ((Math.abs(a)) >= e){
                sum += Math.abs(a);
            }
            x++;
        }

        System.out.println("Sum = " + sum);
    }
}
