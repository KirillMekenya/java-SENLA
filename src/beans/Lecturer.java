package beans;

public class Lecturer {
    private int id;
    private String nameOfLecturer;
    private int courseId;

    public Lecturer(String nameOfLecturer) {
        this.nameOfLecturer = nameOfLecturer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getNameOfLecturer() {
        return nameOfLecturer;
    }

    public void setNameOfLecturer(String nameOfLecturer) {
        this.nameOfLecturer = nameOfLecturer;
    }

    @Override
    public String toString() {
        return this.id + " " + this.nameOfLecturer + " " + this.courseId;
    }
}
