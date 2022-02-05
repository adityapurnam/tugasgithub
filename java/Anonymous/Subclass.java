package Anonymous;

class Demo{
    void show(){
        System.out.println("i am in show method of super class");
    }
}
class Flavor1Demo{
    //An anonymous class demo as base class
    static Demo d = new Demo(){
        void show(){
            super.show();
            System.out.println("i am in flavor1demo class");
        }
};
public static void main(String[]args){
        d.show();
  }
}