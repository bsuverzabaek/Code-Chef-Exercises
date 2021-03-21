# Eugene and Function

Eugene loves sequences, especially arithmetic progressions. One day he was asked to solve a difficult problem.

If a sequence of numbers A<sub>1</sub>, A<sub>2</sub>, ... , A<sub>N</sub> form an arithmetic progression A, he was asked to 
calculate sum of F(A<sub>i</sub>), for L ≤ i ≤ R.

F(X) is defined as:

If X < 10 then F(X) = X.

Else F(X) = F(sum_of_digits(X)).

Example:

F(1378) = F(1+3+7+8) = F(19) = F(1 + 9) = F(10) = F(1+0) = F(1) = 1

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- Each test case is described in one line containing four integers: 
A<sub>1</sub> denoting the first element of the arithmetic progression A, D denoting the common difference between successive members of A, 
and L and R as described in the problem statement.

## Output

For each test case, output a single line containing one integer denoting sum of F(A<sub>i</sub>).

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ A<sub>1</sub> ≤ 10<sup>9</sup>
- 0 ≤ D ≤ 10<sup>9</sup>
- 1 ≤ R ≤ 10<sup>18</sup>
- 1 ≤ L ≤ R

## Example

### Input:

2

1 1 1 3

14 7 2 4

### Output:

6

12

## Explanation

### Case 1

A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...}

A<sub>1</sub> = 1

A<sub>2</sub> = 2

A<sub>3</sub> = 3

F(A<sub>1</sub>) = 1

F(A<sub>2</sub>) = 2

F(A<sub>3</sub>) = 3

1+2+3=6

### Case 2

A = {14, 21, 28, 35, 42, 49, 56, 63, 70, 77, ...}

A<sub>2</sub> = 21

A<sub>3</sub> = 28

A<sub>4</sub> = 35

F(A<sub>2</sub>) = 3

F(A<sub>3</sub>) = 1

F(A<sub>4</sub>) = 8

3+1+8=12
