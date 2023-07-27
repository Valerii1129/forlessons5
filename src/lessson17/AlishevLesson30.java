package lessson17;

public class AlishevLesson30 {
    public static void main(String[] args) {
        float f = 12.132f;

        int i = 1234;
        long l = i;//неявное
        int x = (int) l;//явное
        System.out.println(x);

        byte x2 = (byte) 128;//-128 до 127
        int a = 123;
        double d = a;//неявное
        int b = (int) d;//явное
        System.out.println();
    }
}