/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда
 * в дробной и целой частях). Поменять местами дробную и целую
 * части числа и вывести полученное значение числа.
 */

package by.java_online.module01.linear_program.task04;

public class Version02 {
    public static void main(String[] args) {
        double number;
        double integerPart;  // Целая часть заданного числа
        double fractionalPart;  // Дробная часть заданного числа
        double newNumber;

        number = 100.159;

        //Округляем число до ближайшего целого вниз
        integerPart = Math.floor(number);

        //Округляем до ближайшего целого числа
        fractionalPart = Math.round((number - integerPart) * 1000);

        newNumber = fractionalPart + integerPart / 1000;

        System.out.printf("We have number %.3f. \n" +
                          "If we swap its parts, we'll get %.3f", number, newNumber);
    }
}
