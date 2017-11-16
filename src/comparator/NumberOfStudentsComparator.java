package comparator;

import beans.Course;

import java.util.Comparator;

public class NumberOfStudentsComparator implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        if (o1 != null && o2 != null) {
            int numberO1 = 0;
            int numberO2 = 0;
            for (int i = 0; i < o1.getStudentsOfCourse().length; i++) {
                if (o1.getStudentsOfCourse()[i] != null)
                    numberO1++;
            }
            for (int i = 0; i < o2.getStudentsOfCourse().length; i++) {
                if (o2.getStudentsOfCourse()[i] != null)
                    numberO2++;
            }
            return numberO1 - numberO2;
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
