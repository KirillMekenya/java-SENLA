package comparator;

import beans.Student;

import java.util.Comparator;

public class StudentByNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 != null) {
            return o1.getNameOfStudent().compareTo(o2.getNameOfStudent());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
