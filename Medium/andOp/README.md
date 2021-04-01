# And Operation

Given an array of n non-negative integers: A<sub>1</sub>, A<sub>2</sub>, …, A<sub>N</sub>. 
Your mission is finding a pair of integers A<sub>u</sub>, A<sub>v</sub> (1 ≤ u < v ≤ N) such that (A<sub>u</sub> and A<sub>v</sub>) is as large as possible. 
And is a bit-wise operation which is corresponding to & in C++ and Java.

## Input

- The first line of the input contains a single integer N. 
- The ith line in the next N lines contains the A<sub>i</sub>.

## Output

Contains a single integer which is the largest value of A<sub>u</sub> and A<sub>v</sub>.

## Constraints

- 2 ≤ N ≤ 3 × 10<sup>5</sup>
- 0 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

4

2

4

8

10

### Output:

8

## Explanation

- 2 and 4 = 0
- 2 and 8 = 0
- 2 and 10 = 2
- 4 and 8 = 0
- 4 and 10 = 0
- 8 and 10 = 8
