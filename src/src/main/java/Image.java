package main.java;

public class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: "+name);
    }
}