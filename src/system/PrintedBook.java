package system;

public final class PrintedBook extends PhysicalTitle {
    private int pages;

    public PrintedBook(String title, LiteraturType literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }


    /**
     * Calculates the amount of points a {@code PrintedBook} generates relative to its {@code pages}, {@code literatureType} and {@code copies}.
     * @return amount of points that the ebook generates.
     */
    @Override
    protected double calculatePoints() {
        try {
            return this.pages * this.copies * this.convertLiteratureType();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return 0;
        }
    }
}
