interface ICalcArea {
    abstract void calcArea();
    abstract void calcPerimeter();
}
interface ICalcVolume {
    abstract void calcVolume();
}
class Circle implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Circle Area");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of circle");
    }
}
class Sphere implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Sphere Area");
    }
    public void calcVolume() {
        System.out.println("Sphere Volume");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of a sphere");
    }
}
class HomeTask_ImplementationofInterfaceSegregation_Task08 {
    public static void main(String[] args) {
        ICalcArea circle = new Circle();
        ICalcArea sphere = new Sphere();
        ICalcVolume spherevol = new Sphere();
        circle.calcArea();
        circle.calcPerimeter();
        spherevol.calcVolume();
    }
}