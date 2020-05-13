/*
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае
 */

package by.java_online.module01.linear_program.task06;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        double x;
        double y;

        x = enterVariable("Enter the abscissa");
        y = enterVariable("Enter the ordinate");

        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) |
                (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static double enterVariable(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        double variable;

        System.out.println(message);
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        variable = input.nextDouble();

        return variable;
    }
}
