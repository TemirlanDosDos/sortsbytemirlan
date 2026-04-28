Assignment 3 – Sorting and Searching Algorithm Analysis System

This project implements and analyzes fundamental sorting and searching algorithms in Java. The purpose is to compare their performance using execution time measurements and to evaluate their behavior on different input sizes and data types.

The system includes:
One basic sorting algorithm (Bubble Sort)
One advanced sorting algorithm (Merge Sort)
One searching algorithm (Linear Search)
Performance measurement using System.nanoTime()
Implemented Algorithms
1. Bubble Sort (Basic Sorting)
Bubble Sort is a simple comparison-based algorithm that repeatedly traverses the array and swaps adjacent elements if they are in the wrong order.
Time Complexity:
Best Case: O(n)
Average Case: O(n²)
Worst Case: O(n²)

3. Merge Sort (Advanced Sorting)
Merge Sort is a divide-and-conquer algorithm that splits the array into smaller parts, sorts them recursively, and merges them back together.
Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)

3. Linear Search (Searching)
Linear Search checks each element sequentially until the target value is found or the array ends.
Time Complexity:
Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)
Experimental Setup

The experiments were conducted using:
Array Sizes:
Small: 10 elements
Medium: 100 elements
Large: 1000 elements

Input Types:
Random arrays
Sorted arrays

Execution time was measured using System.nanoTime().

Experimental Results
Array Size	Input Type	Bubble Sort	Merge Sort	Linear Search
Small	Random	Fast	Very Fast	Fast
Medium	Random	Slow	Fast	Medium
Large	Random	Very Slow	Fast	Slow
Large	Sorted	Faster	Stable	Slow

Note: Actual execution times depend on system performance.
Analysis
Bubble Sort is significantly slower than Merge Sort for medium and large arrays due to its quadratic time complexity. Merge Sort demonstrates stable and efficient performance across all input sizes.
As the array size increases, the difference in performance between the two sorting algorithms becomes more noticeable. Bubble Sort becomes impractical for large datasets, while Merge Sort remains efficient.
Sorted input slightly improves Bubble Sort performance but does not significantly change Merge Sort performance.
The experimental results are consistent with theoretical Big-O complexity expectations.
Linear Search is simple and works on any array but becomes slower as the dataset grows.
Binary Search is not implemented in this project, but it requires a sorted array because it relies on repeatedly dividing the search space in half.
Screenshots

Screenshots demonstrating program execution and results should be placed in the following directory:


docs/img.png
docs/img_1.png
docs/img_2.png
docs/img_3.png
docs/img_4.png
docs/img_5.png
docs/img_6.png
docs/img_7.png
docs/img_8.png
docs/img_9.png

This project provided practical insight into how algorithm complexity affects performance. It became clear that simple algorithms like Bubble Sort are not suitable for large datasets, while more advanced algorithms such as Merge Sort provide significantly better efficiency.

The experiment also showed the importance of input size and data structure in performance analysis. Implementing and testing these algorithms helped strengthen understanding of both theoretical and practical aspects of algorithm design.

Project Structure

assignment3/
├── src/
│ ├── Sorter.java
│ ├── Searcher.java
│ ├── Experiment.java
│ └── Main.java
├── docs/
│ └── screenshots/
├── README.md
└── .gitignore

Author

Temirlan Dosmukhambetov
