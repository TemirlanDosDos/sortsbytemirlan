public class Sorter {

    public void basicSort(int[] arr) { // Bubble
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void advancedSort(int[] arr) { // Merge
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) left[i] = arr[i];
            else right[i - mid] = arr[i];
        }

        advancedSort(left);
        advancedSort(right);

        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, l = 0, r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) arr[i++] = left[l++];
            else arr[i++] = right[r++];
        }

        while (l < left.length) arr[i++] = left[l++];
        while (r < right.length) arr[i++] = right[r++];
    }

    public int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }

    public int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}