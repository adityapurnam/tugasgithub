package InnerClass;

class Outer2 {
    void outerMethod(){
        System.out.println("inside outerMethod");
        //Inner class is local to outerMethod()
        class Inner{
            void innerMethod(){
                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class MethodDemo{
    public static void main(String[] args) {
        Outer2 x = new Outer2();
        x.outerMethod();
    }
}
