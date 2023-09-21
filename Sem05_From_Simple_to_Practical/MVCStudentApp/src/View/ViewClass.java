package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClass implements iGetView {
    public void printAllStudent(List<Student> students) {

        System.out.println("---------Список студентов---------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("------------------");

    }

    public String prompt(String msg) {

        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
