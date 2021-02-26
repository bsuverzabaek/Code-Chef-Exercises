# Weird Question

You are given an integer sequence A with length N. 
Find the number of ordered pairs of positive integers (a,b) such that a occurs in A at least b times and b occurs in A at least a times.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the number of pairs.

## Constraints

- 1≤T≤1,000
- 2≤N≤10<sup>6</sup>
- 1≤A<sub>i</sub>≤10<sup>6</sup> for each valid i
- the sum of N over all test cases does not exceed 3⋅10<sup>6</sup>

## Example

### Input:

3

5

1 2 3 4 5

5

1 1 2 2 3

5

3 3 2 2 2

### Output:

1

4

3
