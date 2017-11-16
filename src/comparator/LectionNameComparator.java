package comparator;

import beans.Lection;

import java.util.Comparator;

public class LectionNameComparator implements Comparator<Lection> {
    @Override
    public int compare(Lection o1, Lection o2) {
        if (o1 != null && o2 != null) {
            return o1.getNameOfLection().compareTo(o2.getNameOfLection());
        } else if (o1 != null && o2 == null)
            return 1;
        else
            return -1;
    }
}
