# Maximum K Sums

Chef likes arrays a lot. Today, he found an array A consisting of N positive integers.

Let L denote the sorted (in non-increasing order) list of size N*(N+1)/2 containing the sums of all possible contiguous subarrays of A. 
Chef is interested in finding the first K elements from the list L. Can you help him in accomplishing this task?

## Input

There is only a single test case per input file.

- The first line of input contains two space separated integer numbers N and K denoting the size of the array and the 
number of the maximal sums you need to find.
- The following line contains N space separated integer numbers denoting the array A.

## Output

Output K space separated integers where the i<sup>th</sup> integer denotes the i<sup>th</sup> element of L.

## Constraints

- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ K ≤ min(N*(N+1)/2, 10<sup>5</sup>)
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

3 4

1 3 4

### Output

8 7 4 4

### Input:

3 3

10 2 7

### Output:

19 12 10

## Explanation

### Case 1

The first 4 elements of it are [8, 7, 4, 4].
