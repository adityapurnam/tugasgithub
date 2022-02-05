package tugas;

public class Main {
    public static void main(String[] args) {
    IkanPaus paus = new IkanPaus();
    paus.name = "ikan paus";
    paus.umur = 30;

        System.out.println("Name : "+ paus.name);
        System.out.println("Umur : "+ paus.umur + " tahun");
        paus.swim();
        paus.life();
        paus.breathe();
        paus.breed();

        System.out.println("\n");
        System.out.println("=====================");

        Sapi sapi = new Sapi();
        sapi.name = "Sapi";
        paus.umur = 10;
        System.out.println("Name : "+ sapi.name);
        System.out.println("Umur : "+ paus.umur + " tahun");
        sapi.walk();
        sapi.life();
        sapi.breathe();
        sapi.breed();
    }
}
