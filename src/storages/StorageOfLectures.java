package storages;

import beans.Lecturer;

import java.util.Arrays;

public class StorageOfLectures {
    private Lecturer[] allLecturer = new Lecturer[10];
    private int lastId;

    public Lecturer[] getAllLecturer() {
        return allLecturer;
    }

    public int getNumberOfLecturers() {
        int numberOfLecturers = 0;
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null)
                numberOfLecturers++;
        }
        return numberOfLecturers;
    }

    public void addLecturer(Lecturer lecturer) {
        boolean check = false;
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] == null) {
                check = true;
                break;
            }
        }

        if (check == false) {
            allLecturer = Arrays.copyOf(allLecturer, allLecturer.length * 2);
        }
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] == null) {
                allLecturer[i] = lecturer;
                allLecturer[i].setId(this.lastId + 1);
                this.lastId = allLecturer[i].getId();
                break;
            }
        }
    }

    public void removeLecturer(int id) {
        for (int i = 0; i < allLecturer.length; i++) {
            if (allLecturer[i] != null && allLecturer[i].getId() == id) {
                allLecturer[i] = null;
            }
        }

    }
}
