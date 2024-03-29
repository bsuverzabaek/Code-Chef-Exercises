# A Study in Bake Street

Chef Ada is not just a Chef but also a detective. Currently she is investigating a massive murdering case in Bake Street.

Bake Street is composed of n buildings in a straight line. They are numbered from 1 to n, as you move from left to right. 
The i-th building is at position x<sub>i</sub> and has height h<sub>i</sub>. The buildings are so thin that we can consider them as vertical segments. 
The murderer climbed to the top of one of the buildings and shot at all the 
buildings to the right, which had a lesser height than the building on which he was, and which were in his line of sight.

Ada is interested in the rightmost building that was shot by the murderer. 
Since we don't know the building from which the murderer was shooting, your task is to calculate it for every possible initial position.

## Input

- The first line of input contains one number T, the number of test cases. T test cases follows. 
- The first line of each test case contains an integer n, the number of buildings. 
- The next n lines contains two integers x<sub>i</sub>, h<sub>i</sub>, the position and height of the i-th building.

## Output

For each testcase print n integers: a<sub>i</sub>, the rightmost building shot at, if the murderer started at building i. 
If the murderer didn't shoot to any building, print -1.

## Constraints

- 1 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ x<sub>i</sub>, h<sub>i</sub> ≤ 10<sup>6</sup>
- x<sub>i</sub> < x<sub>i+1</sub>, for all 1 ≤ i < n
- No two different buildings are of the same height
- The sum of n over all test cases is at most 5 * 10<sup>5</sup>

## Example

### Input:

1

7

1 130

65 110

120 40

160 60

240 100

280 65

320 30

### Output:

5 5 -1 -1 7 7 -1

## Explanation

<img width="376" alt="Screen Shot 2021-06-04 at 11 11 26 PM" src="https://user-images.githubusercontent.com/69542867/120881956-f669f100-c591-11eb-9a35-e2d317270cae.png">

The lines of shooting are shown in the figure above.

From building 1, buildings 2 and 5 are shot. As the rightmost is building 5, that is the answer for building 1. 
Note that from building 1 is not possible to shoot at building 4 (dotted line) because building 2 obstructs the line of sight.

From building 2, buildings 3, 4 and 5 are shot. From building 3 and 4, no building is shot at. Hence the third and fourth outputs are -1.
