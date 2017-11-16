package beans;

public class Student {


    private int id;

    private String nameOfStudent;

    public Student(String name) {
        this.nameOfStudent = name;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return this.id + " " + this.nameOfStudent;
    }
}
