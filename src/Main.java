import model.Group;
import model.Student;
import service.Impl.GroupServiceImpl;
import service.Impl.StudentServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group g1 = new Group("java1",1,"backend",2020);
        Group g2 = new Group("java2",2,"backend",2021);
        Group g3 = new Group("java3",3,"backend",2022);
        Group g4 = new Group("java4",4,"backend",2023);

        Student s1 = new Student("aru",26,'m');
        Student s2 = new Student("aku",22,'m');
        Student s3 = new Student("uuu",25,'m');
        StudentServiceImpl studentServiceimpl = new StudentServiceImpl();
        GroupServiceImpl groupServiceImpl = new GroupServiceImpl();
try {
    System.out.println("enter number");
    int n = new Scanner(System.in).nextInt();
    switch (n){
        case 1 -> System.out.println(groupServiceImpl.addNewGroup(g1) + groupServiceImpl.addNewGroup(g2) +
                 groupServiceImpl.addNewGroup(g3) + groupServiceImpl.addNewGroup(g4) );
        case 2 -> System.out.println(groupServiceImpl.getGroupById(1));
        case 3 -> System.out.println(groupServiceImpl.getAllGroups());
        case 4 -> System.out.println(groupServiceImpl.updateGroupName(1,"java"));
        case 5 -> System.out.println(groupServiceImpl.sortGroupByYear("asc"));
        case 6 -> System.out.println(groupServiceImpl.filterByYear(2022, "desc"));
        case 7 -> System.out.println(groupServiceImpl.getGroupById(2,));
    }


}catch (InputMismatchException inputMismatchException){
    System.out.println("only number");
}
    }
}