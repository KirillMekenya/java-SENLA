package beans;

public class Lecturer {
    private int id;
    private String nameOfLecturer;
    private Course course;

    public Lecturer(String nameOfLecturer) {
        this.nameOfLecturer = nameOfLecturer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return this.id + " " + this.nameOfLecturer + " " + this.course.getNameOfCourse();
    }
}
