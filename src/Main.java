import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = sorter.generateRandomArray(size);

        System.out.println("\nGenerated array:");
        sorter.printArray(arr);

        System.out.println("\nMenu:");
        System.out.println("1 - Sorting test");
        System.out.println("2 - Sort array");
        System.out.println("3 - Search element");
        System.out.println("4 - Full experiment");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Bubble: " + experiment.measureSorting(arr, "bubble") + " ns");
                System.out.println("Merge: " + experiment.measureSorting(arr, "merge") + " ns");
                break;

            case 2:
                System.out.println("Choose: 1-Bubble | 2-Merge");
                int sortChoice = scanner.nextInt();

                if (sortChoice == 1) {
                    sorter.bubbleSort(arr);
                } else {
                    sorter.mergeSort(arr);
                }

                System.out.println("Sorted array:");
                sorter.printArray(arr);
                break;

            case 3:
                System.out.print("Enter number to find: ");
                int target = scanner.nextInt();

                int index = searcher.linearSearch(arr, target);

                if (index != -1) {
                    System.out.println("Found at index: " + index);
                } else {
                    System.out.println("Element not found");
                }
                break;

            case 4:
                System.out.print("Enter number to find: ");
                int t = scanner.nextInt();
                experiment.runAll(arr, t);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}