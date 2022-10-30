package homeWork;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String toString() {
        return authorName + " " + authorSurname;
    }


    public boolean equals(Object obj) {
        Author other = (Author) obj;
        return authorName.equals(other.authorName) && authorSurname.equals(other.authorSurname);
    }

    public int hashCode() {
        return Objects.hash(authorSurname, authorName);


    }
}
