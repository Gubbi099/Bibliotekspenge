package system;

public abstract class Title {
    private final String title;
    private final String literatureType;
    protected static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    /**
     * Returns the invidual {@code Title}'s royalty based on {@code points} and a base {@code RATE}.
     * @return a {@code double} which is the titles royalty, rounded to two decimal places.
     */
    public double calculateRoyalty() {
        return Math.floor((this.calculatePoints() * RATE) * 100) / 100;
    }

    protected abstract double calculatePoints();

    /**
     * Converts the string {@code literatureType} to a number value.
     * @return a {@code double} value based on the titles {@code literatureType}
     * @throws IllegalArgumentException
     */
    protected double convertLiteratureType() {
        switch (literatureType.toUpperCase()) {
            case "BI", "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                throw new IllegalArgumentException("Invalid literature type!");
        }
    }
}
