package com.example.ilwoof;

public class User {

    private int Image;
    private String Name;
    private String Email;

    public User(int image, String name, String email) {
        Image = image;
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public int getImage() {
        return Image;
    }
}
