import java.util.Iterator;
import java.util.List;

public class StudentIterator<T extends Comparable <T>,V> implements Iterator<Student<T,V>> {
    private int counter;
    private List<Student<T,V>> group;

    public StudentIterator(List<Student<T,V>> group) {
        this.group = group;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < group.size();
    }

    @Override
    public Student next() {
        // if (!hasNext()) {
        // return null;
        // }
        counter++;
        return group.get(counter - 1);
    }

}
