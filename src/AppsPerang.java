public class AppsPerang {
    public static void main(String[] args) {
        Jagoan jagoan1 = new Jagoan("Jaka Sembung",100);
        Jubah jubah1 = new Jubah("Jubah Putih",7,50);
        Senjata senjata1 = new Senjata("Golok", 25);
        jagoan1.setJubah(jubah1);
        jagoan1.setSenjata(senjata1);
        System.out.println();
        Jagoan jagoan2 = new Jagoan("Si Pitung",100);
        Jubah jubah2 = new Jubah("Jubah Hitam",8,52);
        Senjata senjata2 = new Senjata("Toya", 24);
        jagoan2.setJubah(jubah2);
        jagoan2.setSenjata(senjata2);
        System.out.println (jagoan1.getName() + " memakai " +
                jubah1.getJubah() + " dan bersenjatakan " + senjata1.getSenjata());
        System.out.println(jagoan1.getName() + " memakai " +
                jubah2.getJubah() + " dan bersenjatakan " + senjata2.getSenjata() + "\n");
        jagoan1.display();
        System.out.println();
        jagoan2.display();
        jagoan1.Attack(jagoan2);
        jagoan1.Attack(jagoan2);
        jagoan2.Attack(jagoan1);
        jagoan1.Attack(jagoan2);
        jagoan2.Attack(jagoan1);
    }

}