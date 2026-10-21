import java.util.ArrayList;

public abstract class Title {
    private final String title;
    private final String literatureType;
    protected double rate;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return 0;
    }

    protected double calculatePoints() {
        return 0;
    }

    protected double convertLiteratureType() {
        return 0;
    }
}
