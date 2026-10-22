package system;

public abstract class Title {
    private final String title;
    private final String literatureType;
    protected final double RATE;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
        this.RATE = 0.067574;
    }

    public double calculateRoyalty() {
        return Math.floor((this.calculatePoints() * this.RATE) * 100) / 100;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        switch (literatureType.toUpperCase()) {
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;
        }
    }
}
