public class Senjata extends Jagoan {
    private String namaSenjata;
    private int attack;
    public Senjata(String namaSenjata, int attack){
        super("Senjata",100);
        this.namaSenjata = namaSenjata;
        this.attack = attack;
    }
    public String getSenjata() {
        return this.namaSenjata;
    }
    public int getAttack(){
        return this.attack;
    }
}