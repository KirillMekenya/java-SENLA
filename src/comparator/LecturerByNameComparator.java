package comparator;

import beans.Lecturer;

import java.util.Comparator;

public class LecturerByNameComparator implements Comparator<Lecturer> {
    @Override
    public int compare(Lecturer o1, Lecturer o2) {
        if (o1 != null && o2 != null) {
            return o1.getNameOfLecturer().compareTo(o2.getNameOfLecturer());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
