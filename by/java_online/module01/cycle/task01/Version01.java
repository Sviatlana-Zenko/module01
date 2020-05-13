/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

package by.java_online.module01.cycle.task01;

import java.util.Scanner;

public class Version01 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number;
        long sum;

        System.out.println("Enter x (from 1 to 2147483646)");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        number = input.nextInt();

        // x не должен быть меньше или равен 0
        if (number <= 0) {
            System.out.println("\"x\" can't be negative or equal to zero.");
            return;
        }

        sum = 0;

        int i = 1;
        while (i <= number){
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
