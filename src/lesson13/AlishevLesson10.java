package lesson13;

import java.util.Scanner;

public class AlishevLesson10 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scnr.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из придыдущих условий не подходит");
        }
    }
}
