package lesson6;

public class Start {
    public static void main(String[] args) {
        try (HomeWorksChecker hmwc = new HomeWorksChecker()) {
            throw new RuntimeException("RuntimeException");
        } catch (RuntimeException e) {
            throw new ArithmeticException("ArithmeticException");//Выведиться ArithmeticException.
        }
    }
}

class HomeWorksChecker implements AutoCloseable {
    @Override
    public void close() {
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
    }
}