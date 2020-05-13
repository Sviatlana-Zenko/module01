/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

package by.java_online.module01.conditional_statement.task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        double x;
        double y;

        x = enterValue("Enter angle x in degrees");
        y = enterValue("Enter angle y in degrees");

        //Проверяем, чтобы углы не были отрицательными или равными 0
        if (x <= 0 | y <= 0) {
            System.out.println("An angle can't be negative or equal to zero.");
            return;
        }

        if (x + y < 180) {

            if (x + y == 90) {
                System.out.print("This triangle exists (right triangle).");
            } else {
                System.out.println("This triangle exists (oblique triangle).");
            }

        } else {
            System.out.println("This triangle doesn't exist.");
        }
    }

    public static double enterValue(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double value;

        System.out.println(message);
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        value = input.nextDouble();

        return value;
    }
}
