package system;

public abstract class PhysicalTitle extends Title {
    protected int copies;

    public PhysicalTitle(String title, LiteraturType literatureType, int copies) {
        super(title, literatureType);

        this.copies = copies;
    }
}
