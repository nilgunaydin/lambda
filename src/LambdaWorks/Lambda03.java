package LambdaWorks;

import java.util.*;
import java.util.stream.Stream;


public class Lambda03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("mehmet", "emre", "nilgun",
                "yıldız", "kader", "emine", "islam", "islam", "emre","kokorec"));
        denisik(list);
        System.out.println();
        karakterli(list);
        System.out.println();
        karakterli2(list);
        System.out.println();
        sonHarf(list);
        System.out.println();
        daglarharami(list);
        System.out.println();
        harfsayisi7kntrl(list);
        System.out.println();
        Wile(list);
        System.out.println();
        xkontl(list);
        System.out.println();
        enuzun( list);
        System.out.println();
        enuzun2(list);
        System.out.println();
        ilkHaricenuzun(list);
    }

    private static void daglarharami(List<String> list) {
        boolean control = list.stream().allMatch(t -> t.length() <= 7);
        System.out.println(control);
    }

    //List elemanlarini alafabetik buyuk harf ve  tekrarsiz yazdiriniz
    public static void denisik(List<String> list) {
        list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);

    }

    //list elelmanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz
    public static void karakterli(List<String> list) {
        list.stream().map(t -> t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::PrintEl);


    }


    public static void karakterli2(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }


    //List elemanlarini character sayisina gore kckten byk e gore yazdiriniz.
    public static void karakterSayisiSiraliEl(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(t -> t.length())).//eleman character  sayisina gore ozel siralama yapildi
                forEach(t -> System.out.print(t + " "));
    }

    //list elemanlarinin son harfine gore ters sirali yazdiriniz
    public static void sonHarfTersSiraliEl(List<String> list) {
        list.
                stream().
                sorted(Comparator.
                        comparing(t -> t.toString().
                                charAt(t.toString().length() - 1)).//elemanin length()-1)-->son inedx'inin karakterini alir
                                reversed()).//elemanin length()-1)-->son inedx'inin karakterini ters siralar z->a
                forEach(t -> System.out.print(t + " "));
    }
//uzunlugu cift sayi olan elemanlarin uzunluklarinin karelerini hesaplayan, tekrarsiz buyukten kucuge sirali yazdiriniz.

    public static void sonHarf(List<String> list) {
        list.
                stream().
                //filter(t->t.length()%2==0).
                        map(t -> t.length() * t.length()).//string elemnalr character sayisine cevirildi
                filter(Lambda01::ciftBul).//cift sarti calisti
                distinct().//tekrarsiz
                sorted(Comparator.reverseOrder()).//ters sira b->k
                forEach(Lambda01::PrintEl);//yazdirilidiş
    }
    //List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz


    public static void harfsayisi7kntrl(List<String> list) {
       // System.out.println(list.stream().allMatch(t->t.length()<=7));
        System.out.println(list.stream().allMatch(t -> t.length() <= 7) ? "oki" : "sori");
    }

    //List elemanlarinin w ile baslayip baslamama durumu kontrol

    public static void Wile(List<String> list){
        System.out.println(list.stream().
                noneMatch(t -> t.startsWith("w")) ? "W ile baslayan isim yok" : "kim bu w ile baslayan?");

    }

public static void xkontl(List<String> list){
    System.out.println(list.stream().anyMatch(t -> t.endsWith("x"))?"Kimdir la bu":"tabisi yoq");

}




    //  noneMatch(t -> t.startsWith("w"))--->  "hicbiri W ile baslamiyor" : "birileri W ile basliyor"
    //  allMatch(t -> t.startsWith("w")) --->  "hepsi W ile basliyor" : "bir tanesi W ile baslamiyor"
    //  anyMatch(t -> t.startsWith("w")) --->  "herhangibiri W ile basliyor" : "hicbiri W ile baslamiyor"

//Karakter sayisi en buyuk elemani yazdiriniz

    public static void dargeldibanaankara(List<String> list) {
        Optional<String> uzun=list.stream().reduce((t, u) -> t.length()>u.length()?t:u);
        System.out.println(uzun);
    }
    public static void enuzun(List<String> list){
        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).limit(1));
                //findFirst());
    }
    public static void enuzun2(List<String> list){
        Stream<String> sonIsim = list.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).limit(2);
        System.out.println(Arrays.toString(sonIsim.toArray()));
    }
    public static void ilkHaricenuzun(List<String> list){
        list.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.length() - 1))).skip(1).forEach(t->System.out.print(t+" "));
    }
}
