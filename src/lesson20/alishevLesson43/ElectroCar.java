package lesson20.alishevLesson43;

public class ElectroCar {
    private int id;

    public ElectroCar(int id) {
        this.id = id;
    }

    public void star() {
        Motor motor = new Motor();
        motor.starMotor();

        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("ElectroCar " + id + " is starting...");
    }

    private void test(Object o) {
    }

    // статический вложеный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    // вложеный нестатический класс
    private class Motor {

        public void starMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }
}
