package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    /**
     * Проверка списка студентов
     * 
     * @param studs список студентов
     * @return
     */
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
            System.out.println("List Empty");
        }

        // MVC
        // view.printAllStudent(model.getStudents());

    }

    /**
     * захват с экрана
     */
    Scanner scan = new Scanner(System.in);

    public void run() {

        Command com = Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt("Enter commad LIST DELETE EXIT");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Exit Program");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                /**
                 * Добавил кнопку delete
                 */
                case DELETE:
                    System.out.println("Enter Id for Delete");
                    int idDelete = scan.nextInt();
                    model.removeStudents(idDelete);
                    System.out.println("Delete id " + idDelete);
                    break;

            }

        }
    }
}
