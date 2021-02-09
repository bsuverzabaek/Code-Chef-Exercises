# One Zero Swaps

You are given two binary strings S and P, each with length N. A binary string contains only characters '0' and '1'. 
For each valid i, let's denote the i-th character of S by S<sub>i</sub>.

You have to convert the string S into P using zero or more operations. 
In one operation, you should choose two indices i and j (1≤i<j≤N) such 
that S<sub>i</sub> is '1' and S<sub>j</sub> is '0', and swap S<sub>i</sub> with S<sub>j</sub>.

Determine if it is possible to convert S into P by performing some operations.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains a single string S.
- The third line contains a single string P.

## Output

For each test case, print a single line containing the string "**Yes**" if it is 
possible to convert S into P or "**No**" otherwise (without quotes).

## Constraints

- 1≤T≤10<sup>5</sup>
- 1≤N≤10<sup>5</sup>
- S and P contain only characters '0' and '1'
- The sum of N over all test cases does not exceed 10<sup>5</sup>

## Example

### Input:

3

2

00

00

3

101

010

4

0110

0011

### Output:

Yes

No

Yes

## Explanation

### Case 1

The strings are already equal.

### Case 2

It can be showed that it is impossible to convert S into P.

### Case 3

You can swap S<sub>2</sub> with S<sub>4</sub>. The strings will then be equal.
