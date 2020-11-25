package com.markedline.task01.t10;

import java.text.DecimalFormat;

public class Task10 {
    public static void main(String[] args) {
        Expression func = Task10::tangent;
        double a = 1;
        double b = 2;
        double h = 0.1;
        printResults(a, b, h, func);
    }

    public static double tangent(double x) {
        return Math.tan(x);
    }

    //Буквальное выполнение задания с выводом результатов
    public static void printResults(double a, double b, double h, Expression func) {
        while (a <= b) {
            System.out.println("x = " + a + " f(x) = " + func.getSolution(a) + "\n");
            a += h;
            //Округление, необходимое для ликвидации неточности при вычислениях с double
            a = round(a, getPrecision(h));
        }
    }

    //Выполнение задания для возможности тестирования
    public static double[] getResults(double a, double b, double h, Expression func) {
        if (a > b || h == 0) return new double[0];

        int length = (int) ((b - a) / h);
        double[] resArr = new double[length];
        int i = 0;
        while (a <= b && i < length) {
            resArr[i] = func.getSolution(a);
            a += h;
            a = round(a, getPrecision(h));
            ++i;
        }
        return resArr;
    }

    private static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    private static int getPrecision(double x) {
        return String.valueOf(x).split("\\.")[1].length();
    }

    private static double round(double x, int precision) {
        DecimalFormat f = new DecimalFormat("#." + repeat(precision, "#"));
        return Double.parseDouble(f.format(x).replace(",", "."));
    }

    public interface Expression {
        double getSolution(double x);
    }
}
