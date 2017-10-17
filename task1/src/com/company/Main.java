package com.company;

public class Main {

    public static void main(String[] args) {
        Text text = new Text("Mother is cleaning window");
        text.arr = text.textToArr();
        System.out.println("Length of arr is " + text.arr.length);
        System.out.println("Elements of arr: ");
        for (int i = 0; i < text.arr.length; i++) {
            System.out.println(text.arr[i]);
        }

    }
}
