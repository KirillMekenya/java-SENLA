package comparator;

import beans.Course;

import java.util.Comparator;

public class LecturerComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        if (o1 != null && o2 != null) {
            return o1.getLecturerOfCourse().getNameOfLecturer().compareTo(o2.getLecturerOfCourse().getNameOfLecturer());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
