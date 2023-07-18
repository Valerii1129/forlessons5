package lesson14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlishevLesson12 {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        num1[0] = 0;
        String[] str = new String[3];
        str[0] = "привет";
        str[1] = "пока";
        str[2] = "джава";
        //System.out.println(Arrays.toString(num1));

        for (String str2 : str) {
            System.out.print(str2);
            System.out.print(" ");
        }
        int[] num2 = {1, 2, 3};
        int sum = 0;
        for (int x : num2) {
            sum += x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}
