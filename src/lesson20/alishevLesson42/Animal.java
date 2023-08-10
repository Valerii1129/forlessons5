package lesson20.alishevLesson42;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Animal otherAnimal = (Animal) o;
        return this.id == otherAnimal.id;
    }
}
