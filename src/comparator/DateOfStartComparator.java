package comparator;

import beans.Course;

import java.util.Comparator;

public class DateOfStartComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        if (o1 != null && o2 != null) {
            return o1.getDateOfStart().compareTo(o2.getDateOfStart());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
