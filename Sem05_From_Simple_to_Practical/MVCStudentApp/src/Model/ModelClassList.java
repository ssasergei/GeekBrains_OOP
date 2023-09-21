package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Удаляет студента из списка
     * 
     * @param index индекс студента
     */
    @Override
    public void removeStudents(int index) {
        this.students.remove(index);
    }

}
