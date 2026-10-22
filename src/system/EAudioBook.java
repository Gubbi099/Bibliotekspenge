package system;

public final class EAudioBook extends NetTitle implements IAudioBook{

    private final int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * Calculates the amount of points an {@code EAudiobook} generates relative to its {@code durationInMinutes}, {@code literatureType} and {@code copies}.
     * @return amount of points that the ebook generates.
     */
    protected double calculatePoints() {
        try {
            return (this.getDurationInMinutes() * 0.5) * this.convertLiteratureType() * this.getPseudoCopies();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }
}
