package sample;

import regular.ArrayShift;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array1 = new int[]{1, 2};
//        int[] array2;
//        array2 = null;
//        int[] array = new int[]{1};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayResult = ArrayShift.shift(array3, -8);
        System.out.println(Arrays.toString(arrayResult));
    }
}