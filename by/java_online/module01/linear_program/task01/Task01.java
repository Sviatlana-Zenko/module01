/*
 * Найдите  значение функции: z = ((a – 3 ) * b / 2) + c
 */

package by.java_online.module01.linear_program.task01;

public class Task01 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        a = 3.25;
        b = 0.14;
        c = 8.44;

        z = ((a - 3) * b / 2) + c;

        System.out.println("Function value z = " + z);
    }
}
