package LambdaWorks;
import java.util.*;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
  //      2) "Q01" olarak adlandırılan bir class oluşturun
//        3) 5 String öğesi içeren bir String list oluşturun.
//        4) 3 tanesi "A" harfi ile başlayacak
//        5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
//        5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.
      List<String> list = new ArrayList<String>(Arrays.asList("Angle","Andy","Ali","Emrah","Nilgun"));
        System.out.println(list.stream().filter(t -> t.startsWith("A") & t.length() < 5).
                map(String::toUpperCase).collect(Collectors.toList()));
    }

}
