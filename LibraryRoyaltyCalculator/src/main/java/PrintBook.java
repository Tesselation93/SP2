// Class representing a printed book
class PrintBook extends Title {
    protected int pages;

    // Constructor - initializes a printed book with page count
    public PrintBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Calculates royalties for a printed book
    @Override
    public double calculateRoyalties() {
        double points = pages * convertLiteratureTypePoints() * copies;
        return points * RATE;
    }
}