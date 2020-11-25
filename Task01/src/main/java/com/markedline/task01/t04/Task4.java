package com.markedline.task01.t04;

public class Task4 {

    public static boolean trueOrFalse(int a, int b, int c, int d) {
        int[] nums = new int[]{a, b, c, d};
        int counter = 0;
        for (int elem : nums) {
            if (elem % 2 == 0) counter++;
            if (counter > 1) return true;
        }
        return false;
    }
}
