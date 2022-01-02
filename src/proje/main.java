package proje;

import java.util.*;

public class main {
    static List<ogrenci> ogListesi=new ArrayList<ogrenci>();


    public static void main(String[] args) {

        ogrenciListesi();
        System.out.println("nota gore method:");
        notaGore(60,99);
        System.out.println("yasa gore method:");
        yasaGore();
        System.out.println("yasa ve cinsiyete gore method:");
        yasaVCinsiyete(40,"Erkek");
        System.out.println("isme gore method:");
        ismeGore();
        System.out.println("soyAda gore bir methoddd ");
        soyIsimeGore();
        System.out.println("Ortalama hesaplama methodu");
        ortBul();
    }

    private static void ortBul() {
       Double ort= ogListesi.stream().mapToDouble(ogrenci::getDiplomaNot).average().getAsDouble();
        System.out.println(ort);
    }

    private static void soyIsimeGore() {
        ogListesi.stream().sorted(Comparator.comparing(ogrenci::getSoyIsim)).forEach(System.out::println);
    }

    private static void ismeGore() {
        ogListesi.stream().sorted(Comparator.comparing(ogrenci::getIsim)).forEach(System.out::println);
    }

    private static void yasaVCinsiyete(int yas, String Cinsiyet) {
        ogListesi.stream().filter(t-> t.getYas()<yas & t.getCinsiyet().equalsIgnoreCase(Cinsiyet)).
                sorted(Comparator.comparing(ogrenci::getYas)).forEach(System.out::println);
    }

    private static void yasaGore() {
        ogListesi.stream().sorted(Comparator.comparing(ogrenci::getYas).reversed()).forEach(System.out::println);



    }

    private static void notaGore(int alt,int ust) {
        ogListesi.stream().filter(t-> t.getDiplomaNot()>alt & t.getDiplomaNot()<ust).forEach(System.out::println);
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

