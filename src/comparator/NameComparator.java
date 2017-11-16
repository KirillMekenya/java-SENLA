package comparator;

import beans.Course;

import java.util.Comparator;

public class NameComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        if (o1 != null && o2 != null) {
            return o1.getNameOfCourse().compareTo(o2.getNameOfCourse());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}

