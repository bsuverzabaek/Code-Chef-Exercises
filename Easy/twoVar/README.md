# Two Variables

Chef played an interesting game yesterday. This game is played with two variables X and Y; initially, X=Y=0. 
Chef may make an arbitrary number of moves (including zero). In each move, he must perform the following process:

- Choose any positive integer P such that P*P>Y.
- Change X to P.
- Add P*P to Y.

Unfortunately, Chef has a bad memory and he has forgotten the moves he made. 
He only remembers the value of X after the game finished; let's denote it by X<sub>f</sub>. 
Can you tell him the maximum possible number of moves he could have made in the game?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single integer Xf.

## Output

For each test case, print a single line containing one integer — the maximum number of moves Chef could have made.

## Constraints

- 1≤T≤10<sup>5</sup> 
- 1≤X<sub>f</sub>≤10<sup>9</sup>

## Example

### Input:

3

3

8

9

### Output:

3

5

6

## Explanation

### Case 2

One possible sequence of values of X is 0→1→2→3→5→8.
