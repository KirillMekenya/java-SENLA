package com.company;

public class Operator {
    Flight[] flights = new Flight[10];

    public void addFlight(int number) {
        flights[number] = new Flight();
        flights[number].number = number;
    }

    public void changeStatusFlight(int numberOfFlight, String status) {
        flights[numberOfFlight].status = status;
    }

    public void addPassager(int numberOfFlight, String name) {
        for (int i = 0; i < flights[numberOfFlight].passagers.length; i++) {
            if (flights[numberOfFlight].passagers[i] == null) {
                flights[numberOfFlight].passagers[i] = new Passager(name);
                break;
            }
        }
    }

    public void removePassager(int numberOfFlight, String name) {
        for (int i = 0; i < flights[numberOfFlight].passagers.length; i++) {
            if (flights[numberOfFlight].passagers[i].getName() == name) {
                flights[numberOfFlight].passagers[i] = null;
                break;
            }
        }
    }

    public void printInfo() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                int freePlaces = 0;
                for (int j = 0; j < flights[i].passagers.length; j++) {
                    if (flights[i].passagers[j] == null)
                        freePlaces++;
                }
                System.out.println("Flight number: " + flights[i].number + " free places: " + freePlaces + " status: " + flights[i].status);
            }
        }
    }
}
