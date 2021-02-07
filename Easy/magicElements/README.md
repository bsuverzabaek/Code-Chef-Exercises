# Magic Elements

You are given an array A with size N and a number K. 
Let's call a position i (1 ≤ i ≤ N) valid if, after increasing A<sub>i</sub> by K, it would be greater than the sum of all other elements in the array A.

Determine the number of distinct valid positions.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the number of valid positions.

## Constraints

- 1 ≤ T ≤ 100,000
- 1 ≤ N ≤ 100,000
- 1 ≤ K ≤ 10<sup>9</sup>
- 1 ≤ Ai ≤ 10<sup>4</sup> for each valid i
- 1 ≤ sum of N over all test cases ≤ 100,000

## Example

### Input:

2

4 4

2 1 6 7

4 2

2 1 5 4

### Output:

1

0

## Explanation

### Case 1

- A<sub>1</sub> + K = 6 isn't greater than A<sub>2</sub> + A<sub>3</sub> + A<sub>4</sub> = 14, so position 1 isn't valid. 
- A<sub>2</sub> + K = 5 isn't greater than A<sub>1</sub> + A<sub>3</sub> + A<sub>4</sub> = 15, so position 2 isn't valid. 
- A<sub>3</sub> + K = 10 isn't greater than A<sub>1</sub> + A<sub>2</sub> + A<sub>4</sub> = 10, so position 3 also isn't valid. 
- A<sub>4</sub> + K = 11 is greater than A<sub>1</sub> + A<sub>2</sub> + A<sub>3</sub> = 9. 
- Therefore, there is only one valid position — position 4.
