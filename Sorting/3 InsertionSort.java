package Sorting;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = Input.Arr();
        Input.print(arr);
        insertionSort(arr);
        Input.print(arr);
    }

    static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int j = i;
            int temp = 0;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
