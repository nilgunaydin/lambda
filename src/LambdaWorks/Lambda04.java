package LambdaWorks;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
    public static void main(String[] args) {
        TechPro trGunduz = new TechPro("yaz", "TrGunduz", 97, 124);
        TechPro ingGunduz = new TechPro("kis", "ingGunduz", 95, 131);
        TechPro trGece = new TechPro("bahar", "TrGece", 98, 143);
        TechPro ingGece = new TechPro("sonbhr", "ingGgece", 93, 151);


        List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz,trGece,ingGece,ingGunduz));
        System.out.println(batchOrt92Byk(list));
        System.out.println(batchOrt110kck(list));
        System.out.println(baharvarmi(list));
        System.out.println(ogrsayiusirala( list));
        System.out.println();
        System.out.println(ilk3bOrt(list));
        System.out.println();
        System.out.println(enaz2ci(list));
        System.out.println();
        System.out.println( ort95byktop(list));
//bu classta agirlikli return type calisicaz



    }
    //task1 --> batch ort.lari 92den buyuk old kontrol et.
    public static boolean batchOrt92Byk( List<TechPro> list){
   return list.stream().allMatch(t-> t.getBatchOrt()>92); }//akistaki her elemanin batcgOrt fieldina gore eslemesi contl edildi.
        // list.stream().allMatch(TechPro::getBatchOrt >92);


    //task2 --> ogr sayilarinin hic birinin 110dan kucuk olmad kontrol et.
public static boolean batchOrt110kck(List<TechPro> list){
   return list.stream().noneMatch(t-> t.getOgrenciSayisi()<110);
    }
    //task3 --> bacth sayilarinin herhangibirinde  bahar olup  olmad kontrol et.
    public static boolean baharvarmi(List<TechPro> list){
        return list.stream().anyMatch(t-> t.getBatch().equalsIgnoreCase("bahar"));
    }
    //task4 --> bacthleri ogr sayilarina gore siralayan bir method yaziniz
    public static List<TechPro> ogrsayiusirala(List<TechPro> list){
        return     list.stream().sorted(Comparator.comparing(TechPro::getOgrenciSayisi).reversed()).collect(Collectors.toList());
    }
    public static List<TechPro> ilk3bOrt(List<TechPro> list){
        return list.stream().sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).limit(3).collect(Collectors.toList());
    }
    public static Optional<TechPro> enaz2ci(List<TechPro> list){
        return list.stream().sorted(Comparator.comparing(TechPro::getOgrenciSayisi)).skip(1).findFirst();
    }

    public static int ort95byktop(List<TechPro> list){
        return list.stream().filter(t-> t.getBatchOrt()>95).map(t-> t.getOgrenciSayisi()).reduce(0,Integer::sum);
    }
}
