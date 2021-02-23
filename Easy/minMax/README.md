# Minimum and Maximum

Chef has K chocolates and he wants to distribute them to N people (numbered 1 through N). 
These people are standing in a line in such a way that for each i (1≤i≤N−1), person i and person i+1 are adjacent.

First, consider some way to distribute chocolates such that for each valid i, the number of chocolates 
the i-th person would receive from Chef is A<sub>i</sub> and the sum S<sub>1</sub>=∑<sup>N−1</sup><sub>i=1</sub>|A<sub>i</sub>−A<sub>i+1</sub>| is minimum possible. 
Of course, each person must receive a non-negative integer number of chocolates.

Then, Chef wants to create a new sequence B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N</sub> by rearranging 
(permuting) the elements of the sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>. 
For each valid i, the number of chocolates the i-th person actually receives from Chef is B<sub>i</sub>.
Chef wants to distribute the chocolates (choose B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N</sub> by permuting the sequence A and give B<sub>i</sub> 
chocolates to the i-th person for each valid i) in such a way that S<sub>2</sub>=∑<sup>N−1</sup><sub>i=1</sub>|B<sub>i</sub>–B<sub>i+1</sub>| is maximum possible. 
You need to find the maximum value of S<sub>2</sub>.

It is guaranteed that S<sub>2</sub> does not depend on the exact choice of the 
sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>, as long as it is a sequence that minimises S<sub>1</sub>.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains a single integer K.

## Output

For each test case, print a single line containing one integer — the maximum value of the sum S<sub>2</sub>.

## Constraints

- 1≤T≤10
- 2≤N≤10<sup>5</sup>
- 2≤K≤10<sup>100,000</sup>

## Example

### Input:

1

3

2

### Output:

2

## Explanation

### Case 1

To minimise S<sub>1</sub>, Chef could give 1 chocolate to person 1 and 1 chocolate to person 2, so S<sub>1</sub>=|1−1|+|1−0|=1.

To maximise S<sub>2</sub>, Chef can give 1 chocolate to person 1 and 1 chocolate to person 3, since the sequence B=(1,0,1) is a permutation of A=(1,1,0). 
Then, S<sub>2</sub>=|1−0|+|0−1|=2.
