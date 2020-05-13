/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

package by.java_online.module01.cycle.task04;

import java.math.BigInteger;

public class Version02 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(200);
        BigInteger product = BigInteger.valueOf(1);

        // compareTo() возвращает -1, если a < b; 1, если a > b и 0, если a = b
        while (a.compareTo(b) <= 0) {
            product = product.multiply(a.multiply(a));
            a = a.add(BigInteger.valueOf(1));
        }

        System.out.println("Product = " + product);
    }
}
