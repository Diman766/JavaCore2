package sample;

import regular.PigeonholeSort;

public class Main {

    public static void main(String[] args) {
        int[] my_arr = { 45, 67, 1, 20, 99, 74, 78 };
        System.out.print("The array, after performing pigeonhole sorting is : ");
        int[] array = PigeonholeSort.pigeonhole_sorting(my_arr, my_arr.length);
        for (int j : array) System.out.print(j + " ");
    }
}