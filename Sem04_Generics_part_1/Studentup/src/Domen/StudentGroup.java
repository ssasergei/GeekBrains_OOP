package Domen;

import java.util.Iterator;
import java.util.List;
/**
 * Добавил сортировку групп
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int groupId;
    /**
     * Кол-во студентов
     */
    private int groupSize;

    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
        this.groupSize = group.size();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupid() {
        return groupId;
    }

    public void setGroupid(int groupId) {
        this.groupId = groupId;
    }


    public int getGroupSize() {
        return groupSize;
    }

   
    @Override
    public String toString() {
        String studentOut = "[Номер группы=" + groupId + ", Кол-во студентов =" + groupSize + "\n\n";
        for (Student stu : group){
            studentOut +=stu + "\n";
        }
        return studentOut;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.groupId == o.groupId) {
            return 0;
        } else if (this.groupId > o.groupId) {
            return 1;
        } else
            return -1;
    }

      

}
