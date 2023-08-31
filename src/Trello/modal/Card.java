//package Trello.modal;
//
//public class Card {
//}
//
//
//
//
//import java.io.*;
//        import java.math.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.regex.*;
//
//public class Solution {
//
//
//    /*
//     * Complete the doIt function below.
//     */
//    // static String source , destination;
//    public static void get(List<Integer> v, String num , String source){
//        v.clear();
//        for(char c: num.toCharArray()){
//            v.add(source.indexOf(c));
//        }
//    }
//    public static int to10(List<Integer> from , int n) {
//        int aux = 0;
//        for(int digit: from){
//            aux = aux*n+digit;
//        }
//        return aux;
//    }
//    public static List<Integer> from10(int  num , int n){
//        List<Integer> aux = new ArrayList<>();
//        while(num > 0) {
//            aux.add(num% n) ;
//            num /= n;
//        }
//        for(int i = 0 , j = aux.size() - 1; i < j ; i++ , j--) {
//            int temp = aux.get(i);
//            aux.set(i , aux.get(j));
//            aux.set(j, temp);
//        }
//        return aux;
//    }
//
//    public static String to(List<Integer> from , String source , String destination) {
//        int num = to10(from , source.length());
//        List<Integer> aux = from10(num , destination.length());
//        StringBuilder s = new StringBuilder();
//        for(int digit : aux) {
//            s.append(destination.charAt(digit));
//        }
//        return s.toString();
//    }
//
//
//    static void doIt(String input) {
//        String[] parts = input.split("");
//        if(parts.length != 3){
//            System.out.println("invalid");
//            return ;
//        }
//        String source = parts[1];
//        String destination = parts[2];
//        List<Integer> v = new ArrayList<>();
//        get(v, parts[0] , source);
//        String result = to(v , source , destination);
//        System.out.println(result);
//    }
//
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String input = scanner.nextLine();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        doIt(input);
//
//        scanner.close();
//    }
//}
