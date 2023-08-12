package lesson21.alishevLesson47;

import lesson21.alishevLesson46.Person;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject2 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/lesson21/alishevLesson46/people.bin"))) {
            Person2[] people = (Person2[]) ois.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
