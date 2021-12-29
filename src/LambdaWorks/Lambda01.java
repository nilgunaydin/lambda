package LambdaWorks;

import java.util.*;

public class Lambda01 {


    public static void main(String[] args) {

		/*
		   1) Lambda "Functional Programming"
		      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
		   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
		   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
		   ve hatasiz code yazma acilarindan cok faydalidir.
		   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir
		   ancak map'lerde kullanılmaz.
		   Lambda kullanmak hatasız code kullanmaktır.
		*/
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        printElStructured(list);//method call
        System.out.println();
        printElFunctional(list);//Lambda expression
        System.out.println();
        printElFunctional1(list);
        System.out.println();
        printCiftElStructured(list);
        System.out.println();
        System.out.println("***");
        printCiftElFunctional(list);
        System.out.println();
        printCiftElFunctional2(list);
        System.out.println();
        degisik(list);
        System.out.println();
        degisik2(list);
        System.out.println();
        degisik3(list);
        System.out.println();
        degisik4(list);
        System.out.println();
        degisik7(list);
        System.out.println();
        karekokCiftFunctional(list);
    }

    //structured Programming ile list elemanlarinin tamamini aralarinda bosluk olacak sekilde yazdiriniz.
    public static void printElStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }
    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz

    public static void printElFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//Lambda Expression :Lambda ifadesi

        //stream() : bu method datalari yukaridan asagiya akis sekline getirir.
        //forEach() : datanin parametresine gore her bir elemani isler.
        //t-> : Lambda operatoru
        //Lambda Expression yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir.
    }
    //Method Reference --> kendi olusturdugumuz veya javadan aldigimiz method ile
    //ClassName::MethodName


    public static void PrintEl(int t) {//refere edilecek method created
        System.out.print(t + " ");
    }


    public static void printElFunctional1(List<Integer> list) {
        list.stream().forEach(Lambda01::PrintEl);
    }

    //structured Programming ile list elemanlerinin  cift olanlarini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void printCiftElStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }


    public static void printCiftElFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(Lambda01::PrintEl);
    }

    //filter()--> ais icerisindeki elemanlari istenen sarta gore filtreleme yapar.

    public static boolean ciftBul(int i) {
        return i % 2 == 0;
    }//tohum method
    public static boolean varMi(int i) {
        return true;}//tohum method

    public static void printCiftElFunctional2(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::PrintEl);
    }
    //Functional Programming ile list elemanlarinin  cift olanalrinin
    //60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void degisik(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).filter(t -> t < 60).forEach(Lambda01::PrintEl);

    }
    //Functional Programming ile list elemanlarinin  tek olanlarini veya
    //20 den buyuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void degisik2(List<Integer> list) {
        list.stream().filter(t -> t > 20 || t % 2 == 1).forEach(Lambda01::PrintEl);

    }
    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karelerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void degisik3(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::PrintEl);



    }

    //Functional Programming ile list elemanlarinin  tek olanlarinin kuplerinin bir fazlasini
    public static void degisik4(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> t * t * t + 1).forEach(Lambda01::PrintEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void karekokCiftFunctional(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(Math::sqrt).forEach(t -> System.out.println(t + " "));
    }

    //list in en buyuk elemanini yazdiriniz.

    public static void degisik7(List<Integer> list) {
        int maxEl = list.stream().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(maxEl);
    }
//reduce()--> azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
}
