package db;

import model.Group;
import model.Student;

import java.util.List;

public class DateBase {
    List<Group> groups;
    List<Student> students;

    public DateBase(){}

    public DateBase(List<Group> groups, List<Student> students) {
        this.groups = groups;
        this.students = students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "DateBase{" +
                "groups=" + groups +
                ", students=" + students +
                '}';
    }
}
