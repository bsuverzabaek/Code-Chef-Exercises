# One Dimensional Kingdoms

N one dimensional kingdoms are represented as intervals of the form [a<sub>i</sub> , b<sub>i</sub>] on the real line. 
A kingdom of the form [L, R] can be destroyed completely by placing a bomb at a point x on the real line if L ≤ x ≤ R.

Your task is to determine minimum number of bombs required to destroy all the one dimensional kingdoms.

## Input

- First line of the input contains T denoting number of test cases.
- For each test case, first line contains N denoting the number of one dimensional kingdoms.
- For each next N lines, each line contains two space separated integers a<sub>i</sub> and b<sub>i</sub>.

## Output

For each test case , output an integer denoting the minimum number of bombs required.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 10<sup>5</sup>
- 0 ≤ a<sub>i</sub> ≤ b<sub>i</sub> ≤ 2000

## Example

### Input:

1

3

1 3

2 5

6 9

### Output:

2

## Explanation

### Case 1

There are three kingdoms [1,3] ,[2,5] and [6,9]. You will need at least 2 bombs to destroy the kingdoms. 
In one of the possible solutions, you can place two bombs at x = 2 and x = 6 .
