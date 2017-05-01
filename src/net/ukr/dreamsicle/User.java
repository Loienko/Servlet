package net.ukr.dreamsicle;

import java.util.Set;

/**
 * Created by Yura on 01.05.2017.
 */
public class User {

    private String Name;
    private String Surname;
    private int Age;

    private Set<Question> questions;

    public User() {}

    public User(String name, String surname, int age, Set<Question> questions) {
        Name = name;
        Surname = surname;
        Age = age;
        this.questions = questions;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", questions=" + questions +
                '}';
    }
}
