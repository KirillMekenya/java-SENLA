package managers;

import beans.Lecturer;
import comparator.LecturerByNameComparator;
import storages.StorageOfLectures;

import java.util.Arrays;

public class ManagerOfLecturer {

    private StorageOfLectures storageOfLectures;

    public ManagerOfLecturer() {
        storageOfLectures = new StorageOfLectures();
    }

    public Lecturer[] getAllLecturer() {
        return storageOfLectures.getAllLecturer();
    }

    public int getNumberOfLecturers() {
        return storageOfLectures.getNumberOfLecturers();
    }

    public void addLecturer(Lecturer lecturer) {
        storageOfLectures.addLecturer(lecturer);
    }

    public Lecturer getLecturerById(int id) {
        Lecturer rLecturer = null;
        for (Lecturer lecturer : storageOfLectures.getAllLecturer()) {
            if (lecturer != null) {

                if (lecturer.getId() == id) {
                    rLecturer = lecturer;
                }
            }
        }
        return rLecturer;
    }

    public void removeLecturer(int id) {
        storageOfLectures.removeLecturer(id);
    }

    public Lecturer[] sortByName() {
        Lecturer[] temp = getAllLecturer();
        Arrays.sort(temp, new LecturerByNameComparator());
        return temp;
    }
}

