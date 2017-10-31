package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Course {
    private String nameOfCourse;
    private Date dateOfStart;
    private Student[] studentsOfCourse ;
    private Date dateOfEnd;
    private Lection[] lectionOfCourse;
    private Lecturer lecturerOfCourse;

    public Course(String nameOfCourse, String dateOfStart, String dateOfEnd)
    {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            this.dateOfStart = dateFormat.parse(dateOfStart);

        }
        catch (ParseException e){}
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            this.dateOfEnd = dateFormat.parse(dateOfEnd);

        }
        catch (ParseException e){}
        this.nameOfCourse = nameOfCourse;




    }

    public void setNameOfCourse(String nameOfCourse){
        this.nameOfCourse = nameOfCourse;
    }

    public void setDateOfStart(String date)
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            this.dateOfStart = dateFormat.parse(date);
        }
        catch (ParseException e){}

    }

    public void addStudentsOfCourse(Student studentOfCourse){
        for (int i = 0; i<studentsOfCourse.length; i++)
        {
            if(studentsOfCourse[i]==null) {
                studentsOfCourse[i] = studentOfCourse;
                break;
            }
        }
    }

    public void setDateOfEnd(String date){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH.mm");
            this.dateOfEnd = dateFormat.parse(date);
        }
        catch (ParseException e){}

    }

    public void addLectionOfCourse(Lection lection){
        for (int i = 0; i<lectionOfCourse.length; i++)
        {
            if(lectionOfCourse[i]==null) {
                lectionOfCourse[i] = lection;
                break;
            }
        }
    }
    public void setLecturerOfCourse(Lecturer lecturer){
        this.lecturerOfCourse = lecturer;
    }

    public String getNameOfCourse(){
        return nameOfCourse;
    }
    public Date getDateOfStart() {
        return dateOfStart;
    }

    public Student[] getStudentsOfCourse() {
        return studentsOfCourse;
    }

    public void setStudentsOfCourse(Student[] studentsOfCourse) {
        this.studentsOfCourse = studentsOfCourse;
    }

    public void setLectionOfCourse(Lection[] lectionOfCourse) {
        this.lectionOfCourse = lectionOfCourse;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public Lection[] getLectionOfCourse() {
        return lectionOfCourse;
    }

    public Lecturer getLecturerOfCourse() {
        return lecturerOfCourse;
    }


    public static Comparator<Course> SortByName = new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            if (o1 != null && o2 != null) {
                return o1.getNameOfCourse().compareTo(o2.getNameOfCourse());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
    public static Comparator<Course> SortByDateOfStart = new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            if (o1 != null && o2 != null) {
                return o1.getDateOfStart().compareTo(o2.getDateOfStart());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
    public static Comparator<Course> SortByNumbersOfStudent = new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            if (o1 != null && o2 != null) {
                int numberO1=0;
                int numberO2=0;
                for (int i = 0; i<o1.getStudentsOfCourse().length; i++)
                {
                    if(o1.getStudentsOfCourse()[i]!=null)
                        numberO1++;
                }
                for (int i = 0; i<o2.getStudentsOfCourse().length; i++)
                {
                    if(o2.getStudentsOfCourse()[i]!=null)
                        numberO2++;
                }
                return numberO1-numberO2;
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };

    public static Comparator<Course> SortByLecturer = new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            if (o1 != null && o2 != null) {
                return o1.getLecturerOfCourse().getNameOfLecturer().compareTo(o2.getLecturerOfCourse().getNameOfLecturer());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
}
