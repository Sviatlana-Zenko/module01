/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

package by.java_online.module01.cycle.task01;

import java.math.BigInteger;
import java.util.Scanner;

public class Version02 {
    public static void main(String[] args) {
        BigInteger number;
        BigInteger sum;
        BigInteger i;

        number = BigInteger.valueOf(353484);

        /*
         * Проверяем, чтобы число не было меньше или равено 0.
         * Метод возвращает -1, если a<b; 1, если a>b и 0, если a=b
         */

        if (number.compareTo(BigInteger.valueOf(0)) <= 0) {
            System.out.println("Variable \"x\" can't be negative " +
                                "or equal to zero.");

            return;
        }

        sum = BigInteger.valueOf(0);
        i = BigInteger.valueOf(1);

        while (i.compareTo(number) <= 0){
            sum = sum.add(i);
            i = i.add(BigInteger.valueOf(1));
        }

        System.out.println("Sum = " + sum);
    }
}
