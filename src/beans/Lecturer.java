package beans;

import java.util.Comparator;

public class Lecturer {
    private String nameOfLecturer;
    private Course course;

    public Lecturer(String nameOfLecturer){
        this.nameOfLecturer = nameOfLecturer;
    }

    public static Comparator<Lecturer> SortByName = new Comparator<Lecturer>() {
        @Override
        public int compare(Lecturer o1, Lecturer o2) {
            if (o1 != null && o2 != null) {
                return o1.getNameOfLecturer().compareTo(o2.getNameOfLecturer());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getNameOfLecturer() {
        return nameOfLecturer;
    }

    public void setNameOfLecturer(String nameOfLecturer) {
        this.nameOfLecturer = nameOfLecturer;
    }
}
