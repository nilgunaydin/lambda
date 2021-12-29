package LambdaWorks;

public class replitdeneme {
    public static void main(String[] args) {
    String str="ade1r4d3";
    dgtsum(str);
      // Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

      // input : ade1r4d3

      // output : 8

      // Hint :
      // Use Character.isDigit()
      // Integer.valueOf()

    }

public static void dgtsum(String str){
        Character arr[]=new Character[str.length()];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
        arr[i]=str.charAt(i);//{'a','d','e','1','r'}

        }
        for (int j = 0; j < arr.length; j++) {
        if(Character.isDigit(arr[j])) {
            sum+=Integer.valueOf(arr[j]);
        }}
    System.out.println(sum);
    }}
