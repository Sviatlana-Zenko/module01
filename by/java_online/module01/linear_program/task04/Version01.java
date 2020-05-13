/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда
 * в дробной и целой частях). Поменять местами дробную и целую
 * части числа и вывести полученное значение числа.
 */

package by.java_online.module01.linear_program.task04;

public class Version01 {
    public static void main(String[] args) {
        double number;
        int integerPart;  // Целая часть заданного числа
        int fractionalPart;  // Дробная часть заданного числа
        double newNumber;

        number = 782.457;

        //Явно приводим double к int (дробная часть теряется)
        integerPart = (int) number;
        fractionalPart = (int) (number * 1000) % 1000;

        newNumber = fractionalPart + (integerPart / 1000.0);

        System.out.println("We have number " + number + "\n" +
                            "If we swap its parts, we'll get " + newNumber);
    }
}
