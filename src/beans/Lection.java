package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lection {

    private int id;
    private String nameOfLection;
    private Date date;

    public Lection(String nameOfLection, String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        this.date = dateFormat.parse(date);
        this.nameOfLection = nameOfLection;
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
}

