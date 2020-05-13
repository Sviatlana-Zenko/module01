/*
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах
 * и секундах в следующей форме: ННч ММмин SSc
 */

package by.java_online.module01.linear_program.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int t;
        int h;
        int m;
        int s;

        System.out.println("Enter t");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        t = input.nextInt();

        // Проверяем, чтобы количество секунд не было отрицательным
        if (t < 0 ) {
            System.out.println("Transformation is impossible. " +
                                "This number (t) can't be negative.");

            return;
        }

        h = (t / 3600);
        m = (t % 3600) / 60;
        s = t - (h * 3600) - (m * 60);

        System.out.printf("%d seconds can be transformed into " +
                          "%02dh. %02dm. %02ds.", t, h, m, s);
    }
}
