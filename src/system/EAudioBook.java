package system;

public class EAudioBook extends NetTitle implements IAudioBook{

    private final int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints() {
        return (this.getDurationInMinutes() * 0.5) * this.convertLiteratureType() * this.getPseudoCopies();
    }

    @Override
    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }
}
