package lesson13;

import java.util.Scanner;

public class AlishevLesson8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        System.out.println("Введи 5.");
//        int value = scnr.nextInt();
//        while (value != 5){
//            System.out.println("Введи 5.");
//            value = scnr.nextInt();
//        }
        int value;
        do {
            System.out.println("Введи 5.");
            value = scnr.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели 5.");
    }
}
