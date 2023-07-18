package lesson14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlishevLesson11 {
    public static void main(String[] args) {
        int num = 10;//[10]
        int[] num2 = new int[10];//num2->[массив] Сылоч тип данных
        int[] num3 ={1,2,3};
        for (int i = 0; i < num2.length; i++) {
            num2[i] = i*10;
        }
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
    }
}
