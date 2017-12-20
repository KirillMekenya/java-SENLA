package comparator;

import beans.Course;
import main.Main;

import java.util.Comparator;

public class LecturerComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        if (o1 != null && o2 != null) {
            return Main.facade.getManagerOfLecturer().getAllLecturer()[o1.getIdLecturerOfCourse()].getNameOfLecturer().compareTo(Main.facade.getManagerOfLecturer().getAllLecturer()[o2.getIdLecturerOfCourse()].getNameOfLecturer());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
