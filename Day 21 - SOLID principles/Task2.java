import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("sounds of different animals");
    }

    void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

class Task2 {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
        List<Cat> clist = new ArrayList<>();
        clist.add(new Cat());
        obj.printList(clist);
    }
}
