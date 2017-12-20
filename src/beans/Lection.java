package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lection {

    private int id;
    private String nameOfLection;
    private Date date;
    private int idCourse;


    public Lection(String nameOfLection, String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        this.date = dateFormat.parse(date);
        this.nameOfLection = nameOfLection;
    }

    public Lection(int id, String nameOfLection, Date date, int idCourse) {
        this.id = id;
        this.nameOfLection = nameOfLection;
        this.date = date;
        this.idCourse = idCourse;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        this.date = dateFormat.parse(date);


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfLection() {
        return nameOfLection;
    }

    public void setNameOfLection(String nameOfLection) {
        this.nameOfLection = nameOfLection;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-HH:mm");
        return id + " " + nameOfLection + " " + dateFormat.format(date)+" "+idCourse;
    }
}

