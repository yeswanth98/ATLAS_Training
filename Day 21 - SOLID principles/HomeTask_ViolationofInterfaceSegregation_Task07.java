//interface ICalcShapesArea {
//    abstract void calcArea();
//    abstract void calcVolume();
//}
//class Circle implements ICalcShapesArea {
//    public void calcArea() {
//        System.out.println("Area of circle");
//    }
//    public void calcVolume() {
//        System.out.println("Volume of circle");
//    } // dummy implentation as it been forced
//}
//class Sphere implements ICalcShapesArea {
//    public void calcArea() {
//        System.out.println("Area of sphere");
//    }
//    public void calcVolume() {
//        System.out.println("Volume of sphere");
//    }
//}
//class HomeTask_ViolationofInterfaceSegregation_Task07 {
//    public static void main(String[] args) {
//        ICalcShapesArea circle = new Circle();
//        ICalcShapesArea sphere = new Sphere();
//        circle.calcArea();
//        circle.calcVolume();
//        sphere.calcArea();
//        sphere.calcVolume();
//    }
//}