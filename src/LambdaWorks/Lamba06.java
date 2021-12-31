package LambdaWorks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lamba06 {
        public static void main(String[] args) throws IOException {


    //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a yazdiriniz)
        System.out.println("\n*** nlgn.txt dosyasini okuyunuz -->  ");

        Files.lines(Paths.get("src/LambdaWorks/nlgn.txt")).forEach(System.out::println);

        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
        System.out.println("\n*** nlgn.txt dosyasini buyuk harflerle okuyunuz -->  ");

                Files.lines(Paths.get("src/LambdaWorks/nlgn.txt")).map(String::toUpperCase).forEach(System.out::println);

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle yazdiriniz.
        System.out.println("\n*** nlgn.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");

                Files.lines(Paths.get("src/LambdaWorks/nlgn.txt")).limit(1).map(String::toLowerCase).forEach(System.out::println);

        //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz yazdiriniz
        System.out.println("\n*** nlgn.txt dosyasinda let kelimesinin kac satirda gectiginiz yazdiriniz -->  ");

                System.out.println(Files.lines(Paths.get("src/LambdaWorks/nlgn.txt")).filter(t -> t.contains("let")).count());

                //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz.
        System.out.println("\n*** nlgn.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");

                System.out.println( Files.lines(Paths.get("src/LambdaWorks/nlgn.txt")).
                        map(t->t.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

                //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz.
        System.out.println("\n*** nlgn.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");



        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız yaziniz.
        System.out.println("\n*** nlgn.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");



        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
        System.out.println("\n*** nlgn.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");

        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri yazdiriniz
        System.out.println("\n*** nlgn.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");

        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini yazdiriniz
        System.out.println("\n*** nlgn.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");

        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini yazdiriniz
        System.out.println("\n*** nlgn.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
}
}