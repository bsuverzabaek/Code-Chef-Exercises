# XOR Game

You are given an odd integer N and two integer sequences A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub> and B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N</sub>.

Your task is to reorder the elements of B, forming a new sequence C<sub>1</sub>,C<sub>2</sub>,…,C<sub>N</sub> (i.e. choose a 
permutation P<sub>1</sub>,P<sub>2</sub>,…,P<sub>N</sub> of the integers 1 through N, where C<sub>i</sub>=BP<sub>i</sub> for each valid i), in such a 
way that the following condition holds: (A<sub>1</sub>⊕C<sub>1</sub>)=(A<sub>2</sub>⊕C<sub>2</sub>)=…=(A<sub>N</sub>⊕C<sub>N</sub>), where ⊕ denotes bitwise XOR. 
Find one such reordered sequence or determine that it is impossible.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.
- The third line contains N space-separated integers B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N</sub>.

## Output

If there is no valid way to reorder the sequence B, print a single line containing the integer −1.
Otherwise, print a single line containing N space-separated integers C<sub>1</sub>,C<sub>2</sub>,…,C<sub>N</sub>. 
If there are multiple solutions, you may find any one.

## Constraints

- 1≤T≤10 
- 1≤N≤10<sup>5</sup>
- N is odd
- 0≤A<sub>i</sub>≤10<sup>6</sup> for each valid i
- 0≤B<sub>i</sub>≤10<sup>6</sup> for each valid 

## Example

### Input:

1

5

3 1 2 4 5

2 4 5 1 3

### Output:

3 1 2 4 5
