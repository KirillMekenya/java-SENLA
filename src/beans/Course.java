package beans;

import main.Main;

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
    private int idLecturerOfCourse;


    public Course(int id, String nameOfCourse, Date dateOfStart, Date dateOfEnd, int idLecturer) {
        this.id = id;
        this.nameOfCourse = nameOfCourse;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.idLecturerOfCourse = idLecturer;
    }

    public Course() {
    }

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

    public int getIdLecturerOfCourse() {
        return idLecturerOfCourse;
    }

    public void setIdLecturerOfCourse(int idLecturer) {
        this.idLecturerOfCourse = idLecturer;
        /*
        lecturer.setCourseId(this.getId());*/
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-HH:mm");
        return id + " " + nameOfCourse + " " + dateFormat.format(dateOfStart) + " " + dateFormat.format(dateOfEnd) + " " + idLecturerOfCourse + " ";
    }

    public String toPrint(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-HH:mm");
        StringBuilder sb = new StringBuilder();
        sb.append("**************"+"\n\r"+ id + " " + nameOfCourse + " " + dateFormat.format(dateOfStart) + " " + dateFormat.format(dateOfEnd) + " " + idLecturerOfCourse +"\n\r students: ");

       //printStudents(idCourse)
        for (Student student : Main.facade.getManagerOfStudent().getAllStudents()){
            if (student!=null&& student.getIdCourse()==id)
            sb.append(student.getNameOfStudent()+"\n\r");
        }
        sb.append("lections: ");
        //printLections(idCourse)
        for (Lection lection : Main.facade.getManagerOfLection().getAllLection()){
            if (lection!=null && lection.getIdCourse()==id)
                sb.append(lection.getNameOfLection()+"\n\r");
        }
        sb.append("Lector:");
        sb.append(Main.facade.getManagerOfLecturer().getLecturerById(idLecturerOfCourse).getNameOfLecturer());
        sb.append("\n\r ************************");

        return sb.toString();
    }
}
