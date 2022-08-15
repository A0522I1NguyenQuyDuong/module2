import java.util.Scanner;

public class KyTuChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì");
        String chain = sc.nextLine();
        char charact = 'b';
        System.out.println("Nhập chuỗi vào:" +chain );
        System.out.println("Nhập ký tự cần kiểm tra:" +charact);
        int dem = 0;
        for (int i = 0; i < chain.length(); i++ ){
            if (chain.charAt(i) == charact){
                dem ++;
            }
            System.out.println("Số lần xuất hiện:" +dem);
        }
    }
}
