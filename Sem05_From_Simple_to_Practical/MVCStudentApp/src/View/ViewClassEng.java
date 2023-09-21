package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * вариант класса ViewClassEng с текстом на английском языке
 */
public class ViewClassEng implements iGetView {

    public void printAllStudent(List<Student> students) {
        System.out.println("\u001B[32m----------- Student list -----------\u001B[0m");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\u001B[32m----------------------------------------\u001B[0m");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();

    }

}