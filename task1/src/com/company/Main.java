package com.company;

public class Main {

    public static void main(String[] args) {
        Text text = new Text("Mother is cleaning window");
        text.textToArr();
        System.out.println("Length of arr is " + text.textToArr().length);
        System.out.println("Elements of arr: ");
        for (int i = 0; i < text.textToArr().length; i++) {
            System.out.println(text.textToArr()[i]);
        }

    }
}
