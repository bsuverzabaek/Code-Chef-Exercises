# Count Substrings

Given a string S consisting of only 1s and 0s, find the number of substrings which start and end both in 1.
In this problem, a substring is defined as a sequence of continuous characters S<sub>i</sub>, S<sub>i+1</sub>, ..., S<sub>j</sub> where 1 ≤ i ≤ j ≤ N.

## Input

First line contains T, the number of testcases. 
Each testcase consists of N (the length of string) in one line and string in second line.

## Output

For each testcase, print the required answer in one line.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ N ≤ 10<sup>5</sup>
- Sum of N over all testcases ≤ 10<sup>5</sup>

## Example

### Input:

2

4

1111

5

10001

### Output:

10

3

## Explanation

### Case 1

All substrings satisfy.

### Case 2

Three substrings S[1,1], S[5,5] and S[1,5] satisfy.
