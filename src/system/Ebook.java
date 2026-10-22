package system;

public final class Ebook extends NetTitle {
    private final int characters;
    private final boolean illustrated;

    public Ebook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages() {
        if (this.illustrated) {
            return (((double) this.characters / 1800) + 20) * 1.10;
        }
        return ((double) this.characters / 1800) + 20;
    }

    @Override
    public double calculatePoints() {
        return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();
    }
}
