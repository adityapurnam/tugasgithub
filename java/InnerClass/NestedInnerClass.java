package InnerClass;


    class Outer{
        public void outerMethod() {
        }

        //Simple nested inner clas
        class Inner{
            public void show(){
                System.out.println("In a nested class method");
            }
        }
    }

    class Main{
        public static void main(String[] args) {
            Outer.Inner in = new Outer().new Inner();
            in.show();
        }
    }
