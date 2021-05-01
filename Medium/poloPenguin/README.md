# Polo the Penguin and the XOR

Polo the Penguin likes the XOR operation. 

XOR-sum of a list of numbers is the result of XOR-ing all of them. 
XOR-sum of (A[1] XOR A[2] XOR ... XOR A[N]) is defined as A[1] XOR (A[2] XOR (A[3] XOR ( ... XOR A[N]))).

He has an array A consisting of N integers. Index in the array are numbered from 1 to N, inclusive. 
Let us denote by F(L, R), the XOR-sum of all integers in the array A whose 
indices lie from L to R, inclusive, i.e. F(L, R) = A[L] XOR A[L+1] XOR ... XOR A[R]. 
Your task is to find the total sum of XOR-sums F(L, R) over all L and R such that 1 ≤ L ≤ R ≤ N.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. 
- The first line of each test case contains a single integer N denoting the size of A. 
- The second line contains N space-separated integers A[1], A[2], ..., A[N].

## Output

For each test case, output a single line containing the total sum to the corresponding test case.

## Constraints

- 1 ≤ T ≤ 100,000
- 1 ≤ N ≤ 100,000
- 0 ≤ A[i] ≤ 10<sup>9</sup>
- The total sum of all N over all test cases will not exceed 100,000.

## Example

### Input:

1

2

1 2

### Output:

6

## Explanation

### Case 1

F(1, 1) = A[1] = 1, F(2, 2) = A[2] = 2 and F(1, 2) = A[1] XOR A[2] = 1 XOR 2 = 3. Hence the answer is 1 + 2 + 3 = 6.