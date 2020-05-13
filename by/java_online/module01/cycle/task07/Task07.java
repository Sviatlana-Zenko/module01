/*
 * Для каждого натурального числа в промежутке от m до n вывести
 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

package by.java_online.module01.cycle.task07;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int m;
        int n;

        m = enterVariable("Enter m");
        n = enterVariable("Enter n");

        if (n < m) {
            System.out.println("'m' should be greater than 'n'");
            return;
        }

        for (int i = m; i <= n; i++) {
            boolean simple = true;

            System.out.print("Number " + i + " can be divided into ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    simple = false;
                }
            }

            if (simple == true) {
                System.out.print("1 and itself (a prime number)" );
            }
            System.out.println();
        }
    }

    public static int enterVariable(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int variable;

        System.out.println(message);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        variable = input.nextInt();

        return variable;
    }
}
