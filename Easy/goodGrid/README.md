# Good Grid

In a grid, a cell is said to be good if the value in the cell is maximum in its column and minimum in its row. 
You are given two integers N and X.

Determine whether there exists any N×N grid with **exactly** X good cells. 
The grid can contain repeated elements. You have to answer T such queries.

## Input

- First line will contain T, number of testcases. Then the testcases follow.
- The only line of each test case contains a two space separated integers N and X.

## Output

For every test case if a grid with required conditions exists then print "Yes" otherwise print "No"(without quotes).

## Constraints

- 1≤T≤1000
- 1≤N≤5000
- 1≤X≤N<sup>2</sup>

## Example

### Input:

3

1 1

2 3

2 4

### Output:

Yes

No

Yes

## Explanation

### Case 1

For the first test case, any 1×1 grid contains exactly one good cell.

### Case 2

For the second test case, it can be proven that there does not exist any 2×2 grid with exactly 3 good cells.

### Case 3

For the third test case, any grid with all elements same is a valid grid with exactly 4 good cells.
