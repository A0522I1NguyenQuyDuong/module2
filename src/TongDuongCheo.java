public class TongDuongCheo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {11, 12, 111, 112, 113, 114, 116},
                {123, 231, 341, 253, 352}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " , ");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][j - 1];
        }
        System.out.println("Tổng các phần tử đường chéo =" +sum);
    }
}
