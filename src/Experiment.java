public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equalsIgnoreCase("bubble")) {
            sorter.basicSort(copy);
        }
        else if (type.equalsIgnoreCase("merge")) {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        int[] copy = arr.clone();

        long start = System.nanoTime();

        searcher.LinearSearch(copy, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments(int[] arr,int target) {

        System.out.println("\nBubble Sort Time:");
        System.out.println(measureSortTime(arr, "bubble") + " ns");

        System.out.println("\nMerge Sort Time:");
        System.out.println(measureSortTime(arr, "merge") + " ns");

        System.out.println("\nSearch Time:");
        System.out.println(measureSearchTime(arr, target) + " ns");

    }
}