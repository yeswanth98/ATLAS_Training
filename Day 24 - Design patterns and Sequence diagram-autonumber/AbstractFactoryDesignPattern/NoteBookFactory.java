package AbstractFactoryDesignPattern;

class NoteBookFactory implements BookFactory {
    @Override
    public NoteBook createLongBook() {
        return new LongBook();
    }
    @Override
    public NoteBook createShortBook() {
        return new ShortBook();
    }
    @Override
    public TextBook createLongBookText() {
        // Not supported by NoteBookFactory, you can throw or return null
        return null;
    }
    @Override
    public TextBook createShortBookText() {
        // Not supported by NoteBookFactory, you can throw or return null
        return null;
    }
}