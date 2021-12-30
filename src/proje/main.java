package proje;

import java.util.*;

public class main {
    static List<ogrenci> ogListesi=new ArrayList<ogrenci>();


    public static void main(String[] args) {

        ogrenciListesi();
        notaGore(2,4);

    }

    private static void notaGore(int alt,int ust) {
        ogListesi.stream().sorted(Comparator.comparing(ogrenci::getDiplomaNot).reversed()).
        skip(alt-1).limit(ust-alt+1).forEach(System.out::println);
    }

    private static void ogrenciListesi() {
        ogListesi.add(new ogrenci("Ahmet","Can",30,95.5,"erkek"));
        ogListesi.add(new ogrenci("Ahmet","Yarba",25,90.5,"erkek"));
        ogListesi.add(new ogrenci("Ayse","Can",21,82.5,"kadin"));
        ogListesi.add(new ogrenci("Merve","Aslan",30,98.8,"kadin"));
        ogListesi.add(new ogrenci("Veli","Han",80,35.5,"erkek"));
        ogListesi.add(new ogrenci("Funda","Funda",24,99.2,"kadin"));
    }

}

