package system;

import java.util.ArrayList;

public class Author {
    private String name;
    private final ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    /**
     * Adds a {@code Title} to the Author
     * @param title Title added to Author.
     */
    public void addTitle(Title title) {
        this.titles.add(title);
    }

    /**
     * Returns the total royalties of all the authors titles combined.
     * @return {@code sum} of total royalties
     */
    public double calculateRoyalties() {
        double sum = 0;
        for (Title t : titles) {
            sum += t.calculateRoyalty();
        }
        return Math.floor(sum * 100) / 100;
    }

    /**
     *
     * @return author {@code name}
     */
    public String getName() {
        return this.name;
    }
}
