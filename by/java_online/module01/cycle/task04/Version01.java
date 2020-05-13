/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

package by.java_online.module01.cycle.task04;

public class Version01 {
    public static void main(String[] args) {
        int number1;
        int number2;
        long bound;
        long product;

        number1 = 1;
        number2 = 200;
        bound = 9223372036854775807L;
        product = 1L;

        while (number1 <= number2) {
            int secondPower;
            long difference;

            secondPower = (int) Math.pow(number1, 2);
            difference = bound - product;

            if (difference / product < secondPower) {
                System.out.println("Overflow. We can find product of squares " +
                                    "for numbers from 1 to " + (number1 - 1) +
                                    ".\nProduct = " + product);

                break;
            } else {
                product *= secondPower;
            }

            number1++;
        }
    }
}
