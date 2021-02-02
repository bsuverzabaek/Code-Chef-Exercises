# Medel

You are given a sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub> of distinct integers. 
While the sequence contains at least three elements, look at its first three elements, find the median among these elements and delete it. 
What will the final sequence be?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing K space-separated integers, where K is the length of the final sequence. 

For each valid i, the i-th of these integers should be the i-th element of the final sequence.

## Constraints

- 1≤T≤74
- 3≤N≤19
- 1≤A<sub>i</sub>≤10<sup>9</sup> for each valid i

## Example

### Input:

2

3

2 5 3

10

38 9 102 10 96 7 46 28 88 13

### Output:

2 5 

102 7 

## Explanation 

### Case 1

We remove the element 3 because it is the median of (2,5,3). The final sequence is (2,5).
