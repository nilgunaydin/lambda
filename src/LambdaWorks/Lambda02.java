package LambdaWorks;

import java.util.*;

public class Lambda02 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, -3, 65, 3, 7, 34, 22, -60, 42, 15));
        ciftKareMax(list);
        System.out.println();
        heleHele(list);
        System.out.println();
        ccarp(list);
        System.out.println();
        ciftcaryaz(list);
        System.out.println();
        enK1(list);
        System.out.println();
        enK2(list);
        System.out.println();
        enK3(list);
        System.out.println();
        enK4(list);
        System.out.println();
        bykvekck(list);
        System.out.println();
        krsininsirasi(list);
        System.out.println();
        krsininsirasi2(list);
        System.out.println();
    }


    //List'in cift olan elemanlarin karelerini aliniz ve en buyugunu yazdiriniz

    public static void ciftKareMax(List<Integer> list) {
        //  Optional<Integer> maxEl = list.stream().filter(LambdaClass01::ciftBul).map(t -> t * t).reduce(Integer::max);
        Optional<Integer> maxEl = list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Math::max);

        //reduce(Math::max) da kullanilabilir ancak reduce(Integer::max); daha specific  oldugu icin hizli calisir
        // int maxEl = list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Integer::max);
        // reduce() returne edilen elelman null yada int 'den buyuk olur ihtimali icin Java guvenlik olarak handle ederek
        //Optional class' sart kosuyor
        System.out.println(maxEl);
    }

    //Listteki tum elemanlarin toplamini yazdiriniz
    // Lambda Expression
    public static void hele(List<Integer> list) {
        int toplam = list.stream().reduce(0, Math::addExact);
        //int toplam = list.stream().reduce(0, Integer::sum);
        //t degirkeni ilk degerini her zaman atanan degerden (0) alir.
        // u her zaman degerini list.stream()'den alir(akistan).
        //t ilk degerden sonraki degerlerini islemden alir.
        System.out.println(toplam);
        //System.out.println(list.stream().reduce(0, (t, u) -> t + u));
    }

    public static void heleHele(List<Integer> list) {
        int toplam = list.stream().reduce(0, Integer::sum);
        System.out.println(toplam);
    }

    //List'teki cift elemanlarin carpimini yazdiriniz.
    //Method Reference...
    public static void ccarp(List<Integer> list) {
        int carpim = list.stream().filter(Lambda01::ciftBul).reduce(1, Math::multiplyExact);
        System.out.println(carpim);

    }

    //List'teki cift elemanlarin carpimini yazdiriniz.
    //lambda Expression...
    public static void ciftcaryaz(List<Integer> list) {
        int carpim = list.stream().filter(Lambda01::ciftBul).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }

    //elemanlardan en kucugunu 4 farkli yontem ile yazdiriniz..
    public static void enK1(List<Integer> list) {
        int minel = list.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(minel);
    }

    private static void enK4(List<Integer> list) {
        int minel = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(minel);
    }

    public static int minBul(int x, int y) {
        return x < y ? x : y;
    }

    private static void enK3(List<Integer> list) {
        int minel = list.stream().reduce(Integer.MAX_VALUE, Lambda02::minBul);
        System.out.println(minel);
    }

    private static void enK2(List<Integer> list) {
        int minel = list.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(minel);
    }
//List'teki 15'ten buyuk en kucuk tek sayiyi yazdiriniz

    public static void bykvekck(List<Integer> list) {
        System.out.println(list.stream().filter(t -> t > 15 & t % 2 == 1).reduce(Math::min));

    }

    //list'in cift  elemanlarinin kareleri ni kucukten buyge yazdiriniz
    public static void krsininsirasi(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(t -> t * t).sorted().forEach(Lambda01::PrintEl);
    }

    //list'in tek  elemanlarinin kareleri ni buykten kucuge  yazdiriniz
    public static void krsininsirasi2(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(Lambda01::PrintEl);
    }

}
