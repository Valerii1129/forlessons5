package lesson19.alishevLesson39;

public class Stert39 {
    public static void main(String[] args) {
        //Checked Exeptions(Compile time exception)
        //Unchecked (Runtime exception)

        /*File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);    //checked exception
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

//        int a = 3 / 0; //unchecked

        int[] arr = new int[2];
        System.out.println(arr[2]); //unchecked
    }
}
