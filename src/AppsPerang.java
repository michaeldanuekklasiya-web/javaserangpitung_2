public class AppsPerang {
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung",100);
        Jubah jubahPutih = new Jubah("Jubah Putih",7,50);
        Senjata golok = new Senjata("Golok", 25);
        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);
        System.out.println();

        Jagoan pitung = new Jagoan("Si Pitung",100);
        Jubah jubahHitam = new Jubah("Jubah Hitam",8,52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);
        System.out.println (jakaSembung.getName() + " memakai " +
                jubahPutih.getJubah() + " dan bersenjatakan " + golok.getSenjata());
        System.out.println(pitung.getName() + " memakai " +
                jubahHitam.getJubah() + " dan bersenjatakan " + toya.getSenjata() + "\n");
        jakaSembung.display();
        System.out.println();
        pitung.display();
        jakaSembung.Attack(pitung);
        System.out.println();
        pitung.Attack(jakaSembung);
        System.out.println();
        jakaSembung.Attack(pitung);
        System.out.println();
        pitung.Attack(jakaSembung);

    }

}