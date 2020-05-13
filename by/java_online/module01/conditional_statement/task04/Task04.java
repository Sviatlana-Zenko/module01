/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

package by.java_online.module01.conditional_statement.task04;

public class Task04 {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 5.5;
        double x = 15.5;
        double y = 10.5;
        double z = 5.5;

        if (a <= 0 | b <= 0 | x <= 0 | y <= 0 | z <= 0) {
            System.out.println("Variables can't be negative or equal to zero.");
            return;
        } else {
            if ((a >= x && (b >= y | b >= z)) |
                    (a >= y && (b >= z | b >= x)) |
                        (a >= z && (b >=x | b >= y))){

                System.out.println("A brick can go through a hole.");
            } else {
                System.out.println("A brick can't go through a hole.");
            }
        }
    }
}
