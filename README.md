IT-2502
Rukhanov Birzhan

**A. Project Overview**

🔹 Selected Algorithms

This project implements and analyzes the following algorithms:

Bubble Sort – simple comparison-based sorting algorithm
Merge Sort – divide-and-conquer sorting algorithm
Linear Search – basic searching algorithm

**The purposes of this experiment are:**

To compare performance of various sorting algorithms

Timing the execution using System.nanoTime()

Understanding the change in efficiency due to input data size

Appreciating the practical difference between O(n²) and O(n log n) algorithms

**B. Explanation of the algorithms**
1. Bubble Sort

It works by comparing pairs of consecutive elements, swapping them if their order is not correct until all the elements are sorted.

Time complexity
O(n2)

2. Merge Sort

Works by dividing an array in halves repeatedly, sorting the halves and then merging them to sort the array.

Time complexity
O(n log n)

3. Linear Search

Works by scanning through an array until the element is found.

Time Complexity
O(n)

**C. Experimental Results**

| Input Size  | Bubble Sort         | Merge Sort          | Search Time |
| ----------  | ----------------    | ---------------     | ----------- |
| 25          | 45200ns             | 29700ns             |220600ns     |
| 50          | 338300ns            | 50500ns             |218400ns     |
| 100         | 257300ns            | 90700ns             |212800ns     |
| 500         | 4366000ns           | 481800ns            |246700ns     |


<img width="1799" height="598" alt="image" src="https://github.com/user-attachments/assets/1d5711a5-b0da-4a23-9973-9bd1cfcb8418" />


<img width="1798" height="599" alt="image" src="https://github.com/user-attachments/assets/b7c24be1-b456-4c02-8260-d56915d016dd" />

<img width="1783" height="579" alt="image" src="https://github.com/user-attachments/assets/9ed893ea-5936-409b-9976-8c53e5042df7" />

<img width="1791" height="581" alt="image" src="https://github.com/user-attachments/assets/abfb2743-013d-4edf-93ed-0ac0f101aa14" />




<img width="1776" height="598" alt="image" src="https://github.com/user-attachments/assets/a4c7ea9a-9ca3-4e13-9aab-074966b74d62" />

<img width="1751" height="438" alt="image" src="https://github.com/user-attachments/assets/80891573-0e47-4923-8e43-fc6e021545e7" />

<img width="1842" height="489" alt="image" src="https://github.com/user-attachments/assets/ca0125a5-5a63-4579-8606-604c0a0b03be" />

**E.Reflection Section**
This assignment helped me understand the significance of the efficiency of an algorithm based on varying input sizes. It became evident that Merge Sort was more efficient than Bubble Sort, especially in dealing with larger inputs due to its O(nlogn) complexity whereas Bubble Sort is inefficient at O(n2).

Moreover, theoretical complexity does not necessarily correspond to actual execution times for several reasons including JVM operations and input data. My major challenge in this assignment was the implementation of Merge Sort recursion and array copying.
