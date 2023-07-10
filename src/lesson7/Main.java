package lesson7;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException();
        }catch (MyException myEx){
            myEx.getMessage( "");
        }
    }
}