import system.*;

public class LibraryRoyaltyCalculator {

    private static final int MAX_MUNICIPALITIES = 97;

    public static void main(String[] args) {

        Author author = new Author("J.K Rowling");
        Title title = new PrintedBook("Harry Potter 1", "SKØN", 100, 100);
        Title title2 = new PrintedBook("Harry Potter 2", "SKØN", 7, 120);
        Title titleAudio = new AudioBook("Harry Potter 1", "SKØN", 10, 100);

        author.addTitle(title);
        author.addTitle(title2);
        author.addTitle(titleAudio);

        System.out.println(author.getName() + " : " + author.calculateRoyalties() + "kr");

        Title ebog = new Ebook("123", "FAG", MAX_MUNICIPALITIES, 50, 205, 360000, false);
        System.out.println(((Ebook) ebog).calculatePoints());

    }
}
