package Uploaded;

import java.util.Scanner;

public class ReverseAstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();

        StringBuilder s = new StringBuilder();
        s.append(text);
        s.reverse();
        System.out.println(s);
    }
}
