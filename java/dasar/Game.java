package dasar;

public class Game {
    public static void main(String[] args) {

        //membuat objek player
        Player cilsy = new Player();

        //mengisi atribut player
        cilsy.name = "Cilsy";
        cilsy.speed = 90;
        cilsy.healtPoin = 50;

        //menjalankan method
        cilsy.run();

        if(cilsy.isDead()){
            System.out.println("Game Over!");
        }
    }
}
