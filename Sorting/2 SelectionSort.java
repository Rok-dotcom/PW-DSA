/// 22 jan 2026

/*
By swapping the smallest index at the first index.
 */
package Sorting;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = Input.Arr();
        Input.print(arr);
        selectionSort(arr);
        Input.print(arr);
    }

    static void selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
