package lesson19.alishevLesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start37 {
    public static void main(String[] args) {
        /*File file = new File("asdf");
        try{
            Scanner scnr = new Scanner(file);

            System.out.println("после Scanner'a");
        }catch (FileNotFoundException e){
            System.out.println("файл не найден");
        }
        System.out.println("после ьлока try catch");*/
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("adf");
        Scanner scanner = new Scanner(file);
    }
}
