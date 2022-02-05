package dasar;

public class Player {

    // definisi atribut
    String name;
    int speed;
    int healtPoin;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    // definisi method isDead untuk mengecek nilai kesehatan(healtPoin)
    boolean isDead(){
        if(healtPoin <=0) return true;
        return false;
    }
}
