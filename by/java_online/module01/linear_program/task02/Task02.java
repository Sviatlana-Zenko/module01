/*
 * Вычислить значение выражения по формуле
 * ((𝑏 + √(𝑏^2 + 4*𝑎*𝑐)) / 2*𝑎) - 𝑎^3*𝑐 + 𝑏^(−2)
 * (все переменные принимают действительные значения)
 */

package by.java_online.module01.linear_program.task02;

public class Task02 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double result;

        a = 10.31;
        b = 2.14;
        c = 3.5;

        /*
         * Проверяем значения: (можем ли мы узнать результат
         * без вычисления значения всего выражения), т.к. по стандарту
         * IEEE 754 выделение квадратного корня из отрицательно числа или
         * деление 0/0 дает NaN, а деление на 0 дает бесконечность.
         */

        double partToCheck; // Результат выражения внутри корня квадратного
        partToCheck = Math.pow(b, 2) + 4 * a * c;

        if (partToCheck < 0) {
            System.out.println("You're trying to calculate a square root " +
                                "of a negative number. The calculation result " +
                                "will be NaN (Not a Number).");

        } else if (b < 0 & a == 0) {
            System.out.println("You're trying to divide 0 into 0 " +
                                "(b < 0 and a = 0). The calculation result will " +
                                "be NaN (Not a Number).");

        } else if (a == 0 | b == 0) {
            System.out.println("You're trying to divide 0. " +
                                "The calculation result will be Infinity.");

        } else {
            result = ((b + Math.sqrt(partToCheck)) / (2 * a)) -
                     Math.pow(a, 3) * c + Math.pow(b, -2);

            System.out.println("The expression value = " + result);
        }
    }
}
