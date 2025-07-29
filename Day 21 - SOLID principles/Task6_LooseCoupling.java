// loose coupling

class Student {
    private int roll_no = 0;
    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }
    public void setRoll(int roll) {
        if(!(roll > 100))
            roll_no = roll;
    }
}
class Loose_coupling {
    public static void main(String[] args) {
        Student sobj = new Student();// Person pobj = new Student(); // person got a bonus
        sobj.setRoll(10);
        System.out.println("the roll no of student is "+ sobj.getRoll());
    }
}


/*

	Module 1 Module 2 Module 3
		independent .. they do communicate

// we should do coupling  -- importance

	good maintainability
	testability
	Error propagation
		high coupling - errors and it will propagate throught the project.. not at all recommandable..
	reusability:


No coupling :

	the modules wont interact with eachother.. -- completely independent..

*/
