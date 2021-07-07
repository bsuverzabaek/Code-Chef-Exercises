# Chef and Steps

In order to establish dominance amongst his friends, Chef has decided that he will only walk in large steps of length exactly K feet. 
However, this has presented many problems in Chef’s life because there are certain distances that he cannot traverse. 
Eg. If his step length is 5 feet, he cannot travel a distance of 12 feet. 
Chef has a strict travel plan that he follows on most days, but now he is worried that some of those distances may become impossible to travel. 
Given N distances, tell Chef which ones he cannot travel.

## Input

- The first line will contain a single integer T, the number of test cases.
- The first line of each test case will contain two space separated integers - N, the number of distances, and K, Chef’s step length.
- The second line of each test case will contain N space separated integers, the i<sup>th</sup> of which represents D<sub>i</sub>, the distance of the i<sup>th</sup> path.

## Output

For each testcase, output a string consisting of N characters. 
The i<sup>th</sup> character should be 1 if the distance is traversable, and 0 if not.

## Constraints

- 1≤T≤1000
- 1≤N≤1000
- 1≤K≤10<sup>9</sup>
- 1≤D<sub>i</sub>≤10<sup>9</sup>

## Example

### Input:

1

5 3

12 13 18 20 27216

### Output:

10101

## Explanation

The first distance can be traversed in 4 steps.

The second distance cannot be traversed.

The third distance can be traversed in 6 steps.

The fourth distance cannot be traversed.

The fifth distance can be traversed in 9072 steps.
