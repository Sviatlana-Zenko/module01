/*
 * Найти сумму квадратов первых ста чисел.
 */

package by.java_online.module01.cycle.task03;

public class Task03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int sum = 0;

        while (a <= b) {
            int power;
            power = (int) Math.pow(a, 2);

            sum += power;
            a++;
        }

        System.out.println("Sum = " + sum);
    }
}
