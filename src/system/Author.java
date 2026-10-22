package system;

import java.util.ArrayList;

public class Author {
    private String name;
    private final ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public double calculateRoyalties() {
        double sum = 0;
        for (Title t : titles) {
            sum += t.calculateRoyalty();
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }
}
