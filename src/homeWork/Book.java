package homeWork;

import homeWork.Author;

import java.util.Objects;

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
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return name + " " + age + "";
    }
    public void setAge (int age) {
        age = age;
    }

    @Override
    public int hashCode() {return Objects.hash(name, age);
    }
    public boolean equals(Object obj) {
        Book other = (Book) obj;
        return name.equals(other.name) && age == other.age;
    }

}

