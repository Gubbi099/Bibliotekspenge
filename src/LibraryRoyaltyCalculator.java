import system.*;

public class LibraryRoyaltyCalculator {

    private static final int MAX_MUNICIPALITIES = 97;
    /**
     * 1. Opretter mindst 1 forfatter
     *
     * <p>2. Tilføjer mindst 3 bøger af forskellig slags til forfatteren (herunder mindst 1 lydbog) ved hjælp af {@code Author} klassens {@code addTitle} metode
     *
     * <p>3. Kalder forfatterens {@code calculateRoyalties()} der beregner bibliotekspenge på hver af forfatterens titler, lægger det sammen og returnerer beløbet med 2 decimaler
     *
     * <p>4. Skriver resultatet pænt ud med forfatterens navn og det beløb der skal udbetales
     */
    public static void main(String[] args) {

        Author author = new Author("J.K Rowling");
        Title title = new PrintedBook("Harry Potter 1", LiteraturType.SKØN, 100, 100);
        Title title2 = new PrintedBook("Harry Potter 2", LiteraturType.SKØN, 7, 120);
        Title titleAudio = new AudioBook("Harry Potter 1", LiteraturType.SKØN, 10, 100);

        author.addTitle(title);
        author.addTitle(title2);
        author.addTitle(titleAudio);

        System.out.println(author.getName() + " : " + author.calculateRoyalties() + "kr");

        Author author1 = new Author("Jeff");
        Title ebog = new Ebook("123", LiteraturType.FAG, MAX_MUNICIPALITIES, 50, 205, 360000, false);
        author1.addTitle(ebog);
        System.out.println(author1.calculateRoyalties());

    }
}
