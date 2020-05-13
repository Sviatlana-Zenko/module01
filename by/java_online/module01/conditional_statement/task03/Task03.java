/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */

package by.java_online.module01.conditional_statement.task03;

public class Task03 {
    public static void main(String[] args) {
        double x1 = 1.5;
        double x2 = -2.5;
        double x3 = 2.7;
        double y1 = 3.8;
        double y2 = -2.3;
        double y3 = -1.3;

        /*
         * Формула (x2 - x1) * (y3 - y1) - (y2 -y1) * (x3 - x1)
         * показывает, что площадь треугольника, образованного этими
         * тремя точками, равна 0, а значит, что точки расположены
         * на одной прямой
         */

        if ((x2 - x1) * (y3 - y1) - (y2 -y1) * (x3 - x1) == 0){
            System.out.println("Points belong to one straight line.");
        } else {
            System.out.println("Points don't belong to one straight line.");
        }
    }
}
