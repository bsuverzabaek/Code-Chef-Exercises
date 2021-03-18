# Useful Number

You are given an integer sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>. 
Let's define the useful number of a subsequence of A as the number of 
distinct primes p such that p divides each member of the subsequence, multiplied by the length of the subsequence. 
Find the maximum of useful numbers of all subsequences of A.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-seperated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

Print a single line containing one integer — the maximum useful number.

## Constraints

- 1≤T≤10 
- 1≤N≤10<sup>5</sup>
- 1≤A<sub>i</sub>≤10<sup>5</sup> for each valid i

## Example

### Input:

1

5

2 2 4 17 8

### Output:

4

## Explanation

### Case 1

The subsequence [2,2,4,8] has the maximum useful number. 
The number of distinct primes that divide each member of the subsequence is 1 (only the prime 2) and the 
length of the subsequence is 4, so the useful number of this subsequence is 1⋅4=4.
