package beans;

import java.util.Comparator;

public class Student {
    public static Comparator<Student> SortByName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1 != null && o2 != null) {
                return o1.getNameOfStudent().compareTo(o2.getNameOfStudent());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
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

    @Override
    public String toString() {
        return this.nameOfStudent;
    }
}
