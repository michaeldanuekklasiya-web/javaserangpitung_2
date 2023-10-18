public class Jagoan {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int baseDefense;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;
    private Jubah jubah;
    private Senjata senjata;

    public Jagoan(String name, int baseDefense){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.baseDefense = baseDefense;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }
    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.senjata.getAttack();
    }
    private void levelUp(){
        this.level++;
    }
    void setJubah(Jubah jubah){
        this.jubah = jubah;
    }
    public void setSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.jubah.getAddHealth();
    }
    public void display(){
        System.out.println("Jagoan   : " + this.name);
        System.out.println("Level    : " + this.level);
        System.out.println("Health   : " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack   : " + this.getAttackPower());
        System.out.println("Alive    : " + this.isAlive);
    }

    public void defence(int damage){
        int defencePower = this.jubah.getDefencePower();
        int deltaDamage;
        System.out.println("Kekuatan Pertahanan " + this.name + " = " + defencePower);
        if(damage >= defencePower){
            deltaDamage = damage - defencePower;
        }else{
            deltaDamage = 0;
        }
        System.out.println("Damage Yang diterima " + this.name + " = " + deltaDamage + "\n");
        this.totalDamage += deltaDamage;
        if(this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }
        this.display();
    }
    public void Attack(Jagoan jagoan){
        int damage = this.getAttackPower();
        System.out.println(this.name + " Menyerang " + jagoan.getName() + " Dengan Damage " + damage);
        jagoan.defence(damage);
        this.levelUp();
    }



}