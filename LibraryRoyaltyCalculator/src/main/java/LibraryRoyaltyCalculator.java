// Main class to test the program
public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("Dr Julie Smith");

        // Add books - one printed book and one audiobook
        author.addTitle(new PrintBook("Why Has Nobody Told Me This Before", "NON_FICTION", 100, 422));
        author.addTitle(new AudioBook("Manifest", "NON_FICTION", 30, 300));
        author.addTitle(new PrintBook("The Tools", "NON_FICTION", 50, 200));

        // Calculate total pay
        double totalPay = author.calculateTotalPay();

        // Print total amount
        System.out.println(author.getName() + ": " + totalPay + " kr");
    }
}