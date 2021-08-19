# Maximum Remaining

Chef and Dhyey have become friends recently. Chef wants to test Dhyey's intelligence by giving him a puzzle to solve.

The puzzle contains an integer sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>. 
The answer to the puzzle is the maximum of A<sub>i</sub>%A<sub>j</sub>, taken over all valid i, j.

Help Dhyey solve this puzzle.

## Input

- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the answer to the puzzle.

## Constraints

- 2≤N≤10<sup>5</sup> 
- 1≤A<sub>i</sub>≤10<sup>9</sup> for each valid i

## Example

### Input:

5  

1 2 3 4 5

### Output:

4

### Input:

6  

5 5 5 2 3 8

### Output:

5
