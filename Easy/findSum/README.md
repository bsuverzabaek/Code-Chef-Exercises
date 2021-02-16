# Find the Sum

There is a secret sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>. 
We do not know the elements of this sequence, but we know another sequence B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N−1</sub> such 
that B<sub>i</sub>=A<sub>i</sub>+A<sub>i+1</sub> for each valid i.

You should process Q queries. 
In each query, you are given two indices p and q; your task is to compute A<sub>p</sub>+A<sub>q</sub> or determine that there is not 
enough information to uniquely determine this sum.

## Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and Q.
The second line contains N−1 space-separated integers B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N−1</sub>.
Each of the following Q lines contains two space-separated integers p and q describing a query.

## Output

For each query, if it is impossible to determine the required sum, print a single line containing the string "**UNKNOWN**". 
Otherwise, print a single line containing one integer — the required sum.

## Constraints

- 1≤T≤100
- 2≤N≤10<sup>5</sup>
- 1≤Q≤10<sup>5</sup>
- 1≤p,q≤N
- 1≤B<sub>i</sub>≤10<sup>9</sup> for each valid i
- The sum of N over all test cases does not exceed 5⋅10<sup>5</sup>
- The sum of Q over all test cases does not exceed 5⋅10<sup>5</sup>

## Example

### Input:

1

5 3

4 5 6 7

1 2

1 3

4 1

### Output:

4

UNKNOWN

5
