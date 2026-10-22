package system;

public final class AudioBook extends PhysicalTitle implements IAudioBook{
    private final int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * Returns the duration of the {@code AudioBook} in minutes.
     * @return an {@code int} which is the audiobooks duration in minutes.
     */
    @Override
    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * Calculates the points of the {@code AudioBook} based on its {@code durationInMinutes},
     * {@code copies} and {@code literatureType}.
     * @return a {@code double} which is the audiobooks points.
     */
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * this.copies * this.convertLiteratureType() ;
    }
}
