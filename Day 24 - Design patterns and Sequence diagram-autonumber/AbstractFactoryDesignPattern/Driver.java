package AbstractFactoryDesignPattern;

public class Driver {
    public static void main(String[] args) {
        // Create factories
        BookFactory noteBookFactory = new NoteBookFactory();
        BookFactory textBookFactory = new TextBookFactory();

        // Create notebook products
        NoteBook longNoteBook = noteBookFactory.createLongBook();
        NoteBook shortNoteBook = noteBookFactory.createShortBook();

        // Create textbook products
        TextBook longTextBook = textBookFactory.createLongBookText();
        TextBook shortTextBook = textBookFactory.createShortBookText();

        // Use the products
        if(longNoteBook != null) longNoteBook.writing();
        if(shortNoteBook != null) shortNoteBook.writing();
        if(longTextBook != null) longTextBook.reading();
        if(shortTextBook != null) shortTextBook.reading();
    }
}