# Matrix

You are given a matrix A that consists of N rows and M columns. Every number in the matrix is either zero or one. 
Calculate the number of such triples (i, j, h) where for all the pairs (x, y), where both x and y belong to [1; h] if y >= x, A[i+x-1][j+y-1] equals to one. 
Of course, the square (i, j, i+h-1, j+h-1) should be inside of this matrix. 
In other words, we're asking you to calculate the amount of square submatrices of a given matrix which have ones on and above their main diagonal.

## Input

- The first line of the input consists of two integers - N and M.
- The following N lines describe the matrix. Each line consists of M characters that are either zero or one.

## Output

Output should consist of a single integer - the answer to the problem.

## Constraints

- 1 <= N,M <= 2000
- Each line of M characters is either 0 or 1

## Example

### Input:

2 3

011

111

### Output:

6
