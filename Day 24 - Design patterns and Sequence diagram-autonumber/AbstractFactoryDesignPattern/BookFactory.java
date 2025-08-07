package AbstractFactoryDesignPattern;

public interface BookFactory {
    NoteBook createLongBook();
    NoteBook createShortBook();
    TextBook createLongBookText();
    TextBook createShortBookText();
}