package lesson20.alishevLesson42;

public class Start {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        //System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal1));
        System.out.println(animal1.equals(animal2));

        String str1 = "asd";//str1   >  "asd";
        String str2 = "asd";//str2   ^  "asd";
        System.out.println(str1 == str2);//true

        String str3 = new String("asd");//str1   >  new "asd";
        String str4 = new String("asd");//str2   >  new "asd";
        System.out.println(str1 == str2);//false
    }
}
