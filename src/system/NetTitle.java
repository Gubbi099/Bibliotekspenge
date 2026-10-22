package system;

public abstract class NetTitle extends Title {
    private final int availability;
    private final int reach;
    private final int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    /**
     * Calculates the number of pseudo copies for the {@code NetTitle} based on its {@code reach},
     * {@code availability} and use factor.
     * @return a {@code double} which is the titles number of pseudo copies.
     */
    protected double getPseudoCopies() {
        return (this.reach * 5) + (this.availability * 0.5) + this.getUseFactor();
    }

    /**
     * Returns the use factor of the {@code NetTitle}, which is its {@code use} value.
     * @return an {@code int} which is the titles use factor.
     */
    private int getUseFactor() {
        return this.use;
    }
}
