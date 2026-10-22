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

    protected double getPseudoCopies() {
        return (this.reach * 5) + (this.availability * 0.5) + this.getUseFactor();
    }

    private int getUseFactor() {
        return this.use;
    }
}
