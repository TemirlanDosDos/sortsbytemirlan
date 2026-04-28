public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSorting(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equalsIgnoreCase("bubble")) {
            sorter.bubbleSort(copy);
        } else if (type.equalsIgnoreCase("merge")) {
            sorter.mergeSort(copy);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearch(int[] arr, int target) {
        int[] copy = arr.clone();

        long start = System.nanoTime();
        searcher.linearSearch(copy, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAll(int[] arr, int target) {
        System.out.println("\n--- Performance Test ---");

        System.out.println("Bubble Sort: " + measureSorting(arr, "bubble") + " ns");
        System.out.println("Merge Sort: " + measureSorting(arr, "merge") + " ns");
        System.out.println("Linear Search: " + measureSearch(arr, target) + " ns");
    }
}