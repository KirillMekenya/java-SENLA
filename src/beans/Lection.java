package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Lection {
    public static Comparator<Lection> SortByName = new Comparator<Lection>() {
        @Override
        public int compare(Lection o1, Lection o2) {
            if (o1 != null && o2 != null) {
                return o1.getNameOfLection().compareTo(o2.getNameOfLection());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
    public static Comparator<Lection> SortByDate = new Comparator<Lection>() {
        @Override
        public int compare(Lection o1, Lection o2) {
            if (o1 != null && o2 != null) {
                return o1.getDate().compareTo(o2.getDate());
            } else if (o1 != null && o2 == null)
                return 1;
            else
                return -1;
        }
    };
    private String nameOfLection;
    private Date date;

    public Lection(String nameOfLection, String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            this.date = dateFormat.parse(date);
        } catch (ParseException e) {
        }
        this.nameOfLection = nameOfLection;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            this.date = dateFormat.parse(date);
        } catch (ParseException e) {
        }

    }

    public String getNameOfLection() {
        return nameOfLection;
    }

    public void setNameOfLection(String nameOfLection) {
        this.nameOfLection = nameOfLection;
    }
}

