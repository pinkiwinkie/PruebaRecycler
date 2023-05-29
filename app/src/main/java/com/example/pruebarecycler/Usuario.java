package com.example.pruebarecycler;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String name,
            surname;
    private int imgOficio;

    public Usuario(String name, String surname, int imgOficio) {
        this.name = name;
        this.surname = surname;
        this.imgOficio = imgOficio;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getImgOficio() {
        return imgOficio;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
