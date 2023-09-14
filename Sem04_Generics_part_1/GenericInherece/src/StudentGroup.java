import java.util.Iterator;
import java.util.List;
/**
 * Добавил сортировку групп
 */
public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>>{
    private List<Student<T,V>> group;
    private V groupId;
    /**
     * Кол-во студентов
     */
    private int groupSize;

    public StudentGroup(List<Student<T,V>> group, V groupId) {
        this.group = group;
        this.groupId = groupId;
        // this.groupSize = group.size();
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public V getGroupid() {
        return groupId;
    }

    public void setGroupid(V groupId) {
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
    public Iterator<Student<T,V>> iterator() {
        return new StudentIterator<T,V>(group);

    }

    // @Override
    // public V compareTo(StudentGroup<T,V> o) {
    //     if (this.groupId == o.groupId) {
    //         return 0;
    //     } else if (this.groupId > o.groupId) {
    //         return 1;
    //     } else
    //         return -1;
    // }

      

}
