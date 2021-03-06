# Rise of Cyborgs

Doctor Kunj installed new software on cyborg Shresth. This software introduced Shresth to range minimum queries.

Cyborg Shresth thought of T different problems in each of which you will be given an array A of length N and an array B of length M. 
In each of these problems, you have to calculate:

<img width="232" alt="Screen Shot 2021-02-04 at 11 08 38 PM" src="https://user-images.githubusercontent.com/69542867/106996637-90ce3b00-673e-11eb-9547-ae8994234ddc.png">

Where rangeMin(i,j) returns the minimum element in the range of indices i to j (both included) in array A.

It is given that array B consists of pairwise distinct elements and is in ascending order.

## Input

- First line will contain T, the number of different problems Cyborg Shresth thought of.
- Each problem's input data will be given in three different lines.
- The first line will contain N and M, the length of array A and B respectively.
- The second line will contain N space separated positive integers, which form the array A. 
- The third line will contain M space separated positive integers, which form the array B.

## Output

For each different problem, print on a new line the answer to the problem, i.e. the value of

<img width="232" alt="Screen Shot 2021-02-04 at 11 08 38 PM" src="https://user-images.githubusercontent.com/69542867/106996637-90ce3b00-673e-11eb-9547-ae8994234ddc.png">

## Constraints

- 1≤T≤10<sup>5</sup>
- 1≤N≤10<sup>5</sup>
- 1≤M≤10<sup>5</sup>
- 1≤A[i]≤10<sup>9</sup>
- 1≤B[i]≤N
- It is guaranteed that the sum of N over all test cases does not exceed 10<sup>6</sup>

## Example

### Input:

1

7 3

10 3 7 9 1 19 2

1 4 6

### Output:

43

## Explanation

For the given array A, we have to calculate rangeMin(1,1)+rangeMin(1,4)+rangeMin(1,6)+rangeMin(4,4)+rangeMin(4,6)+rangeMin(6,6).

This is equal to 10+3+1+9+1+19=43.
