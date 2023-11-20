package lesson10;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    public boolean asBoolean() {
        return id > 0;
    }

    public Integer getId() {
        return id;
    }
}
