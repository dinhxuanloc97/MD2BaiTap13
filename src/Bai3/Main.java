package Bai3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Nhap chuoi ");
        String string = sc.nextLine();

        //Tim chuoi lien tiep co do dai lon nhat
        for (int i = 0; i < string.length(); i++) {
            if (list.size()>1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {

                list.clear();//1 cau lenh
            }
            list.add(string.charAt(i));

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for(Character ch : max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
