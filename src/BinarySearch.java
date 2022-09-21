public class BinarySearch {
    static int[] list = {1, 4 ,5 , 2, 7, 0, 33, 42, 10, 65, 34};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
                if (key == list[mid])
                    return mid;
                else
                    low = mid + 1;
            }
            return -1;
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 10));
        System.out.println(binarySearch(list, 33));
        System.out.println(binarySearch(list, 0));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 65));

    }
}
