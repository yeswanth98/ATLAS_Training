package AbstractFactoryDesignPattern;

// Concrete Notebooks
class LongBook implements NoteBook {
    @Override
    public void writing() {
        System.out.println("Writing in Long Notebook.");
    }
}

class ShortBook implements NoteBook {
    @Override
    public void writing() {
        System.out.println("Writing in Short Notebook.");
    }
}

// Concrete TextBooks
class LongBookText implements TextBook {
    @Override
    public void reading() {
        System.out.println("Reading Long TextBook.");
    }
}

class ShortBookText implements TextBook {
    @Override
    public void reading() {
        System.out.println("Reading Short TextBook.");
    }
}
