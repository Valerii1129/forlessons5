package lesson21.alishevLesson48;

public enum Animal {
    DOG("собака"), CAT("кот"), FROG("лягушка");
    private String translation;

    private Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
