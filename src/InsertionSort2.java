public class InsertionSort2 {
    public static void insertion_sort (int[] arr){
        int pos,temp;
        for (int i = 0; i < arr.length; i++){
            pos = i;
            temp = arr[i];
            while (pos > 0 && temp < arr[pos - 1]){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = temp;
            display(arr);
        }
    }

    private static void display(int[] arr) {
        for (int x : arr){
            System.out.print(x + " ");

        }
        System.out.println();
    }

    public static void insertionSort(int[] array){
        int pos,x;
        for (int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,6,7,4,9,10,8};
                insertion_sort(arr);
                display(arr);
    }
}
