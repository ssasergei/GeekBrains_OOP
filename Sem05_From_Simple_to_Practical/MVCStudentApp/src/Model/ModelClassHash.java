package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

/**
 * Модель хранения списка студентов
 */
public class ModelClassHash implements iGetModel {

    /**
     * Словарь студентов (ключ - ID, значение - экземпяр класса Student)
     */
    private HashMap<Long, Student> students;

    /**
     * @param studentList список сдудентов
     */
    public ModelClassHash(List<Student> studentList) {
        this.students = new HashMap<Long, Student>();
        for (Student stud : studentList) {
            this.students.put(((long) stud.getId()), stud);
        }
    }

    /**
     * Возравщает копию списка студентов
     */
    @Override
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        students.forEach((k, v) -> {
            studentList.add(v);
        });
        return studentList;
    }

    /**
     * Удаления студентов
     * @param index индекс студента
     */
    @Override
    public void removeStudents(int index) {
        List<Student> studentList = getStudents();
        studentList.remove(index);

        this.students = new HashMap<Long, Student>();
        for (Student stud : studentList) {
            this.students.put(((long) stud.getId()), stud);
        }

    }
}
