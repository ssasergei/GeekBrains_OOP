package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

/**
 * Метод сортировки учителей
 */
public class TeacherService implements iPersonService<Teacher> {

    /**
     * кол-во учителей
     */
    private int count;
    /**
     * список учителей
     */
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Добавления учителей
     */
    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "Учитель");
        count++;
        teachers.add(teach);
    }

    /**
     * сортировка по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }

}
