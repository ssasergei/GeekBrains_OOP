package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {

        if (studs.size() > 0) {

            return true;
        } else {

            return false;
        }
    }

    public void update() {

        // MVP

        students = model.getStudents();

        if (testData(students)) {

            view.printAllStudent(model.getStudents());
        } else {
            System.out.println("Список пуст");
        }

        // MVC
        // view.printAllStudent(model.getStudents());

    }

    public void run() {

        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Введите команды");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
            }

        }
    }
}
