package ss1_introduction_to_java;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
         int n;
         int status = 1;
         int num = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n số nguyên tố :");
        n = sc.nextInt();
        if(n >= 1){
            System.out.println(n+"Nhập số nguyên tố đầu tiên :");
            System.out.println(2);
            for (int i = 2 ;i <= n; i++){
                for (int j = 2; j <= Math.sqrt(num); j++){
                    if (num%j == 0 ){
                        status = 0;
                        break;
                    }
                }
                if (status != 0){
                    System.out.println(num);
                    i++;
                }
                status = 1;
                num++;
            }
        }
    }
}
