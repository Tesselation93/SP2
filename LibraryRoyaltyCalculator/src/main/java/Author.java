import java.util.ArrayList;
import java.util.List;

// Class representing an author with multiple book titles
class Author {
    protected String name;
    protected List<Title> titles;

    // Constructor - initializes an author with a name and empty book list
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    // Adds a book to the author's collection
    public void addTitle(Title title) {
        titles.add(title);
    }

    // Calculates total earnings from all books
    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalties();
        }
        return Math.round(total * 100.0) / 100.0; // Rounded to 2 decimal places
    }

    // Returns the author's name
    public String getName() {
        return name;
    }
}