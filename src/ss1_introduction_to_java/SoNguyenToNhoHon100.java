package ss1_introduction_to_java;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < 100; i++){
            System.out.println(n++);
        }
    }
}
