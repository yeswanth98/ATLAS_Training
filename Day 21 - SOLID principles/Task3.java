import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("sounds of different animals");
    }

    void printList(List<?>  list) {
        for(Object element: list) {
            System.out.println (element);
        }
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }

    void animalSound(List<? extends Animal> animalList) {
        for(Animal elements : animalList)
            elements.sound();
    }
}

class Task3 {
    public static void main(String[] args) {
        Animal obj = new Cat();
        Cat cat = new Cat();
        obj.sound();
        List<Cat> clist = new ArrayList<>();
        clist.add(new Cat());
        obj.printList(clist);
        clist.add(new Cat());
        cat.animalSound(clist);
    }
}
