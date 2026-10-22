package system;

public final class Ebook extends NetTitle {
    private final int characters;
    private final boolean illustrated;

    public Ebook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    /**
     * Calculates the amount of pages that a certain ebook has depending on if it is {@code illustrated} or not.
     *
     * <p>Default multiplier for illustrated Ebooks is {@code 10%}.
     *
     * @return amount of pages in the {@code Ebook}.
     */
    private double calculatePages() {
        double pages = ((double) this.characters / 1800) + 20 ;
        return this.illustrated ? pages : pages * 1.10;
    }


    /**
     * Calculates the amount of points an Ebook generates relative to its {@code pages}, {@code literatureType} and {@code copies}.
     * @return amount of points that the ebook generates.
     */
    @Override
    public double calculatePoints() {
        try {
            return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return 0;
        }
    }
}
