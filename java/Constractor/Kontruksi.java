package Constractor;

public class Kontruksi {
    public String username;
    public String password;
    public Kontruksi(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class DemoConstructor{
    public static void main(String[] args) {
        Kontruksi cilsy = new Kontruksi ("Cilsy", "yuhuu");
        System.out.println("Username: " + cilsy.username);
        System.out.println("Password: " + cilsy.password);
    }
}