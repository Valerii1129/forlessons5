package lesson8;

public class Phone implements Cloneable {
    private String model;
    private Object version;

    public Phone(String model, Object version) {
        this.model = model;
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    protected Phone clone() throws CloneNotSupportedException {
        return new Phone(model, version);
    }
}