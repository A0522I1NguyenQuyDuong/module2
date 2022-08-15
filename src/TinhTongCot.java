import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4,5,6},
                {11,12,111,112,113,114,116},
                {123,231,341,253,352}
        };
        for (int i = 0;i < arr.length; i++ ){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " , ");
            }
            System.out.print("\n");
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập cột muốn tính");
        int rol = sc.nextInt();
        if (rol > arr[0].length){
            System.out.println("Nhập lại");
        }else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum = sum + arr[i][rol];
            }
            System.out.println("Tính tổng các phần tử cột"+ rol +" = " +sum);
        }
    }
}
