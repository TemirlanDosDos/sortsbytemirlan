import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Experiment experiment = new Experiment();
        Sorter sort = new Sorter();
        Searcher searcher = new Searcher();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int num = input.nextInt();

        int[] arr = sort.generateRandomArray(num);

        System.out.println("Initial array: ");
        sort.printArray(arr);

        System.out.println();

        System.out.println("Choose option:");
        System.out.println("1 - Run sorting experiment");
        System.out.println("2 - Sorting");
        System.out.println("3 - Searcher");
        System.out.println("4 - Run full experiments (performance test)");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Sorting time experiment:");
                System.out.println("Bubble: " + experiment.measureSortTime(arr, "bubble") + " ns");
                System.out.println("Merge: " + experiment.measureSortTime(arr, "merge") + " ns");
                break;

            case 2:
                System.out.println("Choose sorting method: bubble(1) or merge(2)");
                switch (input.nextInt()) {
                    case 1:
                        sort.basicSort(arr);
                        System.out.println("Bubble sorted array:");
                        sort.printArray(arr);
                        break;

                    case 2:
                        sort.advancedSort(arr);
                        System.out.println("Merge sorted array:");
                        sort.printArray(arr);
                        break;
                }
                break;

            case 3:
                System.out.println("Enter value to find:");
                int target = input.nextInt();
                searcher.LinearSearch(arr, target);
                break;
            case 4:
                    System.out.println("Enter value to find:");
                    int target2 = input.nextInt();
                    experiment.runAllExperiments(arr, target2);
        }
        System.out.println();


    }
}