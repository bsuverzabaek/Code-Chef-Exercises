# XOR N-bonacci Sequence

An N-bonacci sequence is an infinite sequence F<sub>1</sub>,F<sub>2</sub>,… such that for 
each integer i>N, F<sub>i</sub> is calculated as f(F<sub>i−1</sub>,F<sub>i−2</sub>,…,F<sub>i−N</sub>), where f is some function. 
A XOR N-bonacci sequence is an N-bonacci 
sequence for which f(F<sub>i−1</sub>,F<sub>i−2</sub>,…,F<sub>i−N</sub>)=F<sub>i−1</sub>⊕F<sub>i−2</sub>⊕…⊕F<sub>i−N</sub>, where ⊕ denotes the bitwise XOR operation.

Recently, Chef has found an interesting sequence S<sub>1</sub>,S<sub>2</sub>,…, which is obtained from prefix 
XORs of a XOR N-bonacci sequence F<sub>1</sub>,F<sub>2</sub>,…. 
Formally, for each positive integer i, S<sub>i</sub>=F<sub>1</sub>⊕F<sub>2</sub>⊕…⊕F<sub>i</sub>. 
You are given the first N elements of the sequence F, which uniquely determine the entire sequence S.

You should answer Q queries. 
In each query, you are given an index k and you should calculate S<sub>k</sub>. 
It is guaranteed that in each query, S<sub>k</sub> does not exceed 10<sup>50</sup>.

## Input

- The first line of the input contains two space-separated integers N and Q.
- The second line contains N space-separated integers F<sub>1</sub>,F<sub>2</sub>,…,F<sub>N</sub>.
- The following Q lines describe queries. Each of these lines contains a single integer k.

## Output

For each query, print a single line containing one integer S<sub>k</sub>.

## Constraints

- 1≤N,Q≤10<sup>5</sup>
- 0≤F<sub>i</sub>≤10<sup>9</sup> for each i such that 1≤i≤N
- 1≤k≤10<sup>9</sup>

## Example

### Input:

3 4

0 1 2

7

2

5

1000000000

### Output:

3

1

0

0
