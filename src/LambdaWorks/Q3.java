package LambdaWorks;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        //String isimlerden olusan bir list olusturun
        //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
//Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
//Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
//Konsoldaki farklı öğeleri ters sırada yazdırın.
//Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.

            List<String> list=new ArrayList<>();
            list.add("Lutfullah");
            list.add("Emine");
            list.add("Emine");
            list.add("Yusuf");
            list.add("Seyfullah");
            list.add("Hakan");
            //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
            list.stream().distinct().sorted().forEach(t-> System.out.println(t+ "="+ t.length()));
            System.out.println("********************************");
            //Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
            list.stream().distinct().sorted(Comparator.comparing(t->t.length()))
                    .forEach(t-> System.out.println(t));
            System.out.println("*****************************");
            //Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
            list.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                    .forEach(t-> System.out.println(t));
            System.out.println("************************************");
            //Konsoldaki farklı öğeleri ters sırada yazdırın.
            list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));
            System.out.println("*************************************");
            //Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
            list.stream().filter(t->t.length()<7).distinct().map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));
        }

}
