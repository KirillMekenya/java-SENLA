package beans;

public class Student {

    private int id;
    private String nameOfStudent;
    private int idCourse;

    public Student(int id,String name,int idCourse) {
        this.nameOfStudent = name;
        this.id = id;
        this.idCourse = idCourse;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;


    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return this.id + " " + this.nameOfStudent + " "+idCourse;
    }
}
