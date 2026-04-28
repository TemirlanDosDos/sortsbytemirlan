public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equals("basic")) sorter.basicSort(copy);
        else sorter.advancedSort(copy);

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] copy = arr.clone();

        long start = System.nanoTime();
        searcher.search(copy, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("\n=== Size: " + size + " ===");

            int[] random = sorter.generateRandomArray(size);
            int[] sorted = sorter.generateSortedArray(size);

            System.out.println("Random Array:");
            System.out.println("Basic Sort: " + measureSortTime(random, "basic"));
            System.out.println("Advanced Sort: " + measureSortTime(random, "advanced"));

            System.out.println("Sorted Array:");
            System.out.println("Basic Sort: " + measureSortTime(sorted, "basic"));
            System.out.println("Advanced Sort: " + measureSortTime(sorted, "advanced"));

            System.out.println("Search Time: " + measureSearchTime(random, random[size / 2]));
        }
    }
}