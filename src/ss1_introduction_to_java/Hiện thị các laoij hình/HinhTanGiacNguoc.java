package ss1_introduction_to_java;

import java.util.Scanner;

public class HinhTanGiacNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n :");
        int n = sc.nextInt();
        for (int i=7;i>=1;i--){
            for (int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
