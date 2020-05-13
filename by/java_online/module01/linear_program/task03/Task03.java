/*
 * Вычислить значение выражения по формуле:
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) * 𝑡𝑔 𝑥𝑦
 * (все переменные принимают действительные значения)
 */

package by.java_online.module01.linear_program.task03;

public class Task03 {
    public static void main(String[] args) {
        double angleX;
        double angleY;
        double inRadiansX;
        double inRadiansY;
        double inRadiansXY;
        double result;

        angleX = 10.0;
        angleY = 350.5;

        inRadiansX = Math.toRadians(angleX);
        inRadiansY = Math.toRadians(angleY);
        inRadiansXY = Math.toRadians(angleX * angleY);

        result = ((Math.sin(inRadiansX) + Math.cos(inRadiansY)) /
                 (Math.cos(inRadiansX) - Math.sin(inRadiansY))) * Math.tan(inRadiansXY);

        System.out.println("The expression value = " + result);
    }
}
