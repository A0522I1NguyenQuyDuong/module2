package ss1_introduction_to_java;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        int a = 3 , b = 6;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
