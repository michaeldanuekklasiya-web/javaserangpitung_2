public class Jubah extends Jagoan {
    private String namaJubah;
    private int strength;
    private int health;
    private int baseDefense;

    public Jubah(String namaJubah, int strength, int health){
        super("Pitung",100);
        this.namaJubah = namaJubah;
        this.strength = strength;
        this.health = health;
    }
    public String getJubah(){
        return this.namaJubah;
    }
    public int getAddHealth(){
        return this.strength*10 + this.health;
    }
    public int getDefencePower(){
        return this.strength*2 + this.baseDefense;
    }
}