class Book{
    String title;
    int publicationYear;

    Book(String title, int year){
        this.title = title;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int year, String name, String bio){
        super(title,year);
        this.name=name;
        this.bio = bio;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
public class LMS{
    public static void main(String[] args) {
        Author author = new Author("Harry Potter and the Philosopher's Stone", 1997, "J. K. Rowling", "British author");
        author.displayInfo();
    }
}
