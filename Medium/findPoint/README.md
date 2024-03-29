# Find the Point

Jem is going to buy a house in Bearland. Can you help him to choose it?

Bearland has shape of circle with radius R metres and center at the point (0, 0). 
There is a house at every point with integer coordinates (expressed in metres), excluding the border. 
Since Jem likes traveling abroad, he wants to live very close to the border. 
More precisely, his house must be at most K centimeters away from the circular border. 
He also requires that the coordinates of his house must be positive. 
Find and print coordinates of any house fulfilling Jem's wishes. If there is no such house, print -1.

## Input

- The first line of the input contains one integer T, the number of test cases.
- The i-th of following T lines contains two integers R and K, describing one test case.

## Output

For each test case print the answer in a separate line — two integer coordinates 
of any house Jem can buy, or print -1 if none house satisfies the described conditions.

## Constraints

- 1 ≤ T ≤ 100
- 2 ≤ R ≤ 10<sup>9</sup>
- 1 ≤ K ≤ 99

## Example

### Input:

2

10 16

12 1

### Output:

9 4

-1

## Explanation

### Case 1

Jem's house must be at most 16 centimeters - which is equal to 0.16 metres away from the border. 
The distance from the point (9, 4) to the border is: 10 - sqrt(9<sup>2</sup> + 4<sup>2</sup>) ~ 0.15 < 0.16.
