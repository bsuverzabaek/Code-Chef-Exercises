# Positive AND

A permutation p<sub>1</sub>,p<sub>2</sub>...p<sub>N</sub> of {1,2,...,N} is beautiful if p<sub>i</sub>&p<sub>i+1</sub> is greater than 0 for every 1≤i<N. 
You are given an integer N, and your task is toconstruct a beautiful permutation of length N or determine that it's impossible.

Note that a&b denotes the bitwise AND of a and b.

## Input

- First line will contain T, number of testcases. Then the testcases follow. 
- Each testcase contains a single line of input, an integer N.

## Output

For each test case output −1 if there is no suitable permutation of length N, otherwise output N 
integers in a single line which form a beautiful permutation. 
If there are multiple answers output any of them.

## Constraints

- 1≤N≤10<sup>5</sup> 
- The sum of N over all test cases does not exceed 10<sup>6</sup>

## Example

### Input:

3

4

3

5

### Output:

-1

1 3 2

2 3 1 5 4
