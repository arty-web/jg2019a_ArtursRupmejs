package lv.jg.lesson5.level1;

//no Book klass jāpārnes divas metodes
public class BookTest {

    public static void main(String[] args) {

        Book bookBecoming = new Book("Michelle Obama", "Becoming", 448);
        Book bookBeginning = bookBecoming;
        Book bookTheWonkyDonkey = new Book("Craig Smith", "The Wonky Donkey", 24);
        Book bookUnfreedomOfThePress = new Book("Michelle Obama", "Becoming", 448);
        Book bookCrazyCatLady = new Book("Michelle Obama", "Crazy Cat Lady", 633);

        bookBecoming.compareViaEquals(bookBecoming, bookTheWonkyDonkey);
        bookBecoming.compareViaEquals(bookBecoming, bookBeginning);
        bookBecoming.compareViaEquals(bookBecoming, bookUnfreedomOfThePress);
        bookBecoming.compareViaEquals(bookBecoming, bookCrazyCatLady);

    }

}
