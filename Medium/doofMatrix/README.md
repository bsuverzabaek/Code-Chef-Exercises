# Doofish Matrix

Dr. D is now fond of matrices. He is particularly interested in Doofish Matrices. 
A Doofish Matrix of order N is a matrix with N rows (numbered 1 through N) and N columns (numbered 1 through N) such that:

- Each element of this matrix is an integer between 1 and 2N−1 inclusive.
- For each i and j (1≤i≤N, 1≤j≤2N−1), the integer j appears in the i-th row and/or in the i-th column.

Now, for a given N, Dr. D is wondering if there is a Doofish Matrix of order N. 
Find such a matrix or determine that it does not exist. If there are multiple solutions, you may find any one.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single integer N.

## Output

- First, print a line containing the string "Hooray" if a Doofish Matrix of order N exists or "Boo" if it does not.
- If it exists, print N more lines describing one such matrix. For each valid i, the i-th of these 
lines should contain N space-separated integers ― the elements in the i-th row.

## Constraints

- 1≤T≤2,000
- 1≤N≤2,000
- the sum of N<sup>2</sup> over all test cases does not exceed 4⋅10<sup>6</sup>

## Example

### Input:

2

1

2

### Output:

Hooray

1

Hooray

3 1

2 3
