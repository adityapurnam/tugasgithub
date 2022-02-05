package Constractor;

public class Constructor {
    private String username;
    private String password;

    public Constructor(){
        System.out.println("ini adalah constructor");
    }
}

class DemoConstractor{
    public static void main(String[] args) {
        Constructor cilsy = new Constructor();
    }
}
