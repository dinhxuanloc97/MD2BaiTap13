package Bai1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();
            //them ki tu i vao trong list
            list.add(str.charAt(i));
            for (int j = i + 1 ; j < str.length()  ; j++){
                if (str.charAt(i) > list.getLast()){
                    list.add(str.charAt(j));
                }

            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}