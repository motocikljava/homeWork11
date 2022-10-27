package homeWork;

import homeWork.Author;

public class Book {
    private String name;
    private int age;
    private Author author;
    public Book(String name, int age, Author author) {
        this.name = name;
        this.age = age;
        this.author = author;

    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String toString() {
        return this.name + " " + this.age + "";
    }
    public void setAge (int age) {
        this.age = age;
    }
/*
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        return name.equals(other.name) && age == other.age;
    }

 */
}

