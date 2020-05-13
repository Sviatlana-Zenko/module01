/*
 * Даны два числа. Определить цифры, входящие в запись
 * как первого так и второго числа.
 */

package by.java_online.module01.cycle.task08;

public class Task08 {
    public static void main(String[] args) {
        int number1 = 1122331122;
        int number2 = 225124123;

        int counter1;
        int counter2;

        counter1 = findNumberOfDigits(number1);
        counter2 = findNumberOfDigits(number2);

        while (counter1 > 0) {
            int digitFromNumber1;
            digitFromNumber1 = number1 % 10;

            if (checkDigit(number1, counter1, digitFromNumber1)) {
                if (checkForEqualDigit(number2, counter2, digitFromNumber1)) {
                    System.out.print(digitFromNumber1 + "; ");
                }
            }

            number1 /= 10;
            counter1--;
        }

    }

    public static int findNumberOfDigits(int number) {
        int counter = 1;

        while (number / 10 > 0) {
            counter += 1;
            number /= 10;
        }

        return counter;
    }

    public static boolean checkDigit(int number1, int counter1, int digitFromNumber1) {
        boolean isUnique = true;

        number1 /= 10;
        while (counter1 - 1 > 0) {
            int digit;
            digit = number1 % 10;

            if (digitFromNumber1 == digit) {
                isUnique = false;
                break;
            }

            counter1--;
            number1 /= 10;
        }

        return isUnique;
    }

    public static boolean checkForEqualDigit(int number2, int counter2, int digitFromNumber1) {
        boolean isEqual = false;

        while (counter2 > 0) {
            int temp;
            temp = number2 % 10;

            number2 /= 10;

            if (digitFromNumber1 == temp) {
                isEqual = true;
                break;
            }

            counter2--;
        }

        return isEqual;
    }
}
