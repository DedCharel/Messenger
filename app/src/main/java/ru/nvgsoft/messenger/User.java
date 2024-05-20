package ru.nvgsoft.messenger;

public class User {

    private String id;
    private String Name;
    private String LastName;
    private int age;
    private boolean isOnline;

    public User(String id, String name, String lastName, int age, boolean isOnline) {
        this.id = id;
        Name = name;
        LastName = lastName;
        this.age = age;
        this.isOnline = isOnline;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
