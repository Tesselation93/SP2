// Class representing an audiobook
class AudioBook extends Title {
    protected int durationInMinutes;

    // Constructor - initializes an audiobook with duration in minutes
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    // Calculates royalties for an audiobook
    @Override
    public double calculateRoyalties() {
        double points = (durationInMinutes / 2.0) * convertLiteratureTypePoints() * copies;
        return points * RATE;
    }
}