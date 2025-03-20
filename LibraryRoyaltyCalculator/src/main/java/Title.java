// Base class for all book types
class Title {
    protected String title;
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574; // Library payment rate for 2025

    // Constructor - initializes a book with title, type, and number of copies
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    // Converts literature type to its corresponding point value
    protected double convertLiteratureTypePoints() {
        switch (literatureType) {
            case "PICTURE_BOOK":
            case "COMIC":
                return 3;
            case "POETRY":
                return 6;
            case "FICTION":
                return 1.7;
            case "NON_FICTION":
                return 1;
            default:
                return 0;
        }
    }

    // Base method for calculating royalties, overridden in subclasses
    public double calculateRoyalties() {
        return 0;
    }
}