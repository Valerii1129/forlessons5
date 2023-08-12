package lesson21.alishevLesson46;

import java.io.*;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Tom"), new Person(3, "Mike")};

        try {
            FileOutputStream fos = new FileOutputStream("src/lesson21/alishevLesson46/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
