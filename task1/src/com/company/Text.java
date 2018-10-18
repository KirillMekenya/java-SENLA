package com.company;

public class Text {
    String text;
    String[] arr;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] textToArr() {
        arr = text.split(" ");
        return arr;
    }
}
