package lesson21.alishevLesson47;

import lesson21.alishevLesson46.Person;

import java.io.*;
import java.util.Arrays;

public class WriteObject2 {
    public static void main(String[] args) {
        Person2[] people = {new Person2(1, "Bob"), new Person2(2, "Tom"), new Person2(3, "Mike")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/lesson21/alishevLesson46/people.bin"))) {
            oos.writeInt(people.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}