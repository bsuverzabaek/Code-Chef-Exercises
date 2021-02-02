# Plus Multiply

Chef has a sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>. 
He needs to find the number of pairs (i,j)(1≤i<j≤N) such that A<sub>i</sub>+A<sub>j</sub>=A<sub>i</sub>⋅A<sub>j</sub>. 
However, he is busy, so he asks for your help.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. 
The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer ― the desired number of pairs.

## Constraints

- 1≤T≤20
- 1≤N≤40,000
- 0≤Ai≤10<sup>9</sup> for each valid i

## Example

### Input:

2

3

2 4 2

3

0 2 3

### Output:

1

0

## Explanation

### Case 1

The only valid pair is (1,3).

### Case 2

We can see that no valid pair exists.
