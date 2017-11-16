package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Course {

    private int id;
    private String nameOfCourse;
    private Date dateOfStart;
    private Student[] studentsOfCourse = new Student[10];
    private Date dateOfEnd;
    private Lection[] lectionOfCourse = new Lection[10];
    private Lecturer lecturerOfCourse;


    public void addStudentsOfCourse(Student studentOfCourse) {
        boolean check = false;
        for (int i = 0; i < this.studentsOfCourse.length; i++) {
            if (studentsOfCourse[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            studentsOfCourse = Arrays.copyOf(studentsOfCourse, studentsOfCourse.length * 2);
        }
        for (int i = 0; i < studentsOfCourse.length; i++) {
            if (studentsOfCourse[i] == null) {
                studentsOfCourse[i] = studentOfCourse;
                break;
            }
        }
    }

    public void addLectionOfCourse(Lection lection) {
        boolean check = false;
        for (int i = 0; i < lectionOfCourse.length; i++) {
            if (lectionOfCourse[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            lectionOfCourse = Arrays.copyOf(lectionOfCourse, lectionOfCourse.length * 2);
        }
        for (int i = 0; i < lectionOfCourse.length; i++) {
            if (lectionOfCourse[i] == null) {
                lectionOfCourse[i] = lection;
                break;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String date) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        this.dateOfStart = dateFormat.parse(date);


    }

    public Student[] getStudentsOfCourse() {
        return studentsOfCourse;
    }

    public void setStudentsOfCourse(Student[] studentsOfCourse) {
        this.studentsOfCourse = studentsOfCourse;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(String date) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        this.dateOfEnd = dateFormat.parse(date);
    }

    public Lection[] getLectionOfCourse() {
        return lectionOfCourse;
    }

    public void setLectionOfCourse(Lection[] lectionOfCourse) {
        this.lectionOfCourse = lectionOfCourse;
    }

    public Lecturer getLecturerOfCourse() {
        return lecturerOfCourse;
    }

    public void setLecturerOfCourse(Lecturer lecturer) {
        this.lecturerOfCourse = lecturer;
        lecturer.setCourse(this);
    }

    public int getNumberOfStudents() {
        int number = 0;
        for (Student student : studentsOfCourse) {
            if (student != null)
                number++;
        }
        return number;
    }

    @Override
    public String toString() {
        return nameOfCourse + " " + dateOfStart.toString() + " " + dateOfEnd.toString() + " " + lecturerOfCourse.getNameOfLecturer() + " ";
    }
}
