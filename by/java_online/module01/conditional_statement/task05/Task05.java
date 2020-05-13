/*
 * Вычислить значение функции:
 * x^2 - 3*x + 9, x <= 3
 * 1/(x^3 + 6), x > 3
 */

package by.java_online.module01.conditional_statement.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double x;
        double functionValue;

        System.out.println("Enter variable x");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        x = input.nextDouble();

        if (x <= 3){
            functionValue = Math.pow(x, 2) - 3 * x + 9;
        } else {
            functionValue = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("Function value = " + functionValue);
    }
}
