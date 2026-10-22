package system;

public class AudioBook extends PhysicalTitle implements IAudioBook{
    private final int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public int getDurationInMinutes() {
        return 0;
    }

    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * this.copies * this.convertLiteratureType() ;
    }
}
