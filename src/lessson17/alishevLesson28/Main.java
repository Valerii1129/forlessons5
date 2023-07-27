package lessson17.alishevLesson28;

import lessson17.alishevLesson28.packet1.Person;

public class Main {
    public int id;
    private int id2;

    public static void main(String[] args) {
        //private,
        //default(все что в дефолт доступно в пределах этого пакета),
        //protected (доступны в пределах одного пакета, доступы всем подклассам, даже если эти подклассы вне пакета)
        //public
        Person person = new Person("Bob");
        System.out.println(person/*.name*/);//не видно данной переменной
    }
    //private void technicalMethod(){}
}
