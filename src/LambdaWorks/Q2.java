package LambdaWorks;
import java.util.*;
public class Q2 {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);

        int sonuc=list.stream().filter(t->list.indexOf(t)>1).map(t->t*t).reduce(0,Integer::sum);
        System.out.println(sonuc);
    }
}
