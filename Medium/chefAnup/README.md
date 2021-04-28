# Chef Anup

Chef Anup is making dishes. Each dish consists of N ingredients, and quantity of each ingredient is an integer between 1 and K inclusive.

Relative quality of 2 dishes is determined by their lexicographic order. 
Dish A is of lower quality than dish B if there is a position i (1<=i<=N) such that A<sub>j</sub> = B<sub>j</sub> for all j < i and A<sub>i</sub> < B<sub>i</sub>. 
E.g., if N = 2 and K = 2, then the possible dishes in lexicographic order are (1,1), (1,2), (2,1), (2,2).

Given an integer L, determine the L<sup>th</sup> possible dish in increasing order of quality.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- Each test case description consists of a single line containing three integers N, K and L as described above.

## Output

For each test case, print N space-separated integers in a single line describing the quantities of the ingredients for the L<sup>th</sup> dish.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 10<sup>3</sup> 
- 2 ≤ K ≤ 10<sup>3</sup> 
- 1 ≤ L ≤ 10<sup>18</sup>
- L will not exceed the total number of possible dishes

## Example

### Input:

4

3 3 1

3 3 2

3 3 3

3 3 4

### Output:

1 1 1

1 1 2

1 1 3

1 2 1
