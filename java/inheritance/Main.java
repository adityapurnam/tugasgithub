package inheritance;

public class Main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        Zombie zumbi = new Zombie();
        zumbi.name ="takut";
        zumbi.hp = 100;
        zumbi.attackPoin = 90;
        zumbi.attack();

        Pocong hantuPocong = new Pocong();
        Burung garuda = new Burung();
    }
}
