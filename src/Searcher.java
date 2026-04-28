public class Searcher {
    public void LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
