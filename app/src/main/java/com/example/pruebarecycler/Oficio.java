package com.example.pruebarecycler;

public class Oficio {
    private int img;
    private String name;

    public Oficio(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
