package model.entity;

public class Person {
    private String id;
    private String name;
    private String family;
    
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person { " +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", family = '" + family + '\'' +
                '}';
    }

    public String getFamily() {
        return family;
    }
    
}
