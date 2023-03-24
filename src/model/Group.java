package model;

public class Group {
    private String name;
    private int id;
    private String description;
    private int year;

    public Group(){}

    public Group(String name, int id, String description, int year) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
