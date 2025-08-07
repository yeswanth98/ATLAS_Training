package AbstractFactoryDesignPattern;

class TextBookFactory implements BookFactory {
    @Override
    public NoteBook createLongBook() {
        return null; // Not supported in TextBookFactory
    }
    @Override
    public NoteBook createShortBook() {
        return null; // Not supported in TextBookFactory
    }
    @Override
    public TextBook createLongBookText() {
        return new LongBookText();
    }
    @Override
    public TextBook createShortBookText() {
        return new ShortBookText();
    }
}