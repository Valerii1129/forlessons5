package lesson13;

public class AlishevLesson9 {
    public static void main(String[] args) {
//        int i = 0;
//        while(true){
//            if (i== 15){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("это нечетное число " + i);

        }
    }
}
