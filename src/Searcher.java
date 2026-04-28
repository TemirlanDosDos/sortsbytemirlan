public class Searcher {

    public int search(int[] arr, int target) { // Linear
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}