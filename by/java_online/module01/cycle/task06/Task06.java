/*
 * Вывести на экран соответствий между символами и их численными
 * обозначениями в памяти компьютера.
 */

package by.java_online.module01.cycle.task06;

public class Task06 {
    public static void main(String[] args) {
        char firstChar;
        char lastChar;

        firstChar = 'A';
        lastChar = 'z';

        //Выведем коды ASCII для всех символов от 'A' до 'z'
        for (char character = firstChar; character <= lastChar; character++) {
            int asciiCode = character;

            System.out.println("For character '" + character +
                                "' ASCII code is " + asciiCode);
        }
    }
}
