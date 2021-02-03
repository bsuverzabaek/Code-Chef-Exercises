# Rupsa and the Game

Princess Rupsa saw one of her friends playing a special game. The game goes as follows:

- N+1 numbers occur sequentially (one at a time) from A<sub>0</sub> to A<sub>N</sub>.
- You must write the numbers on a sheet of paper, such that A<sub>0</sub> is written first. 
The other numbers are written according to an inductive rule — after A<sub>i-1</sub> numbers have been 
written in a row, then A<sub>i</sub> can be written at either end of the row. 
That is, you first write A<sub>0</sub>, and then A<sub>1</sub> can be written on its left or right to make A<sub>0</sub>A<sub>1</sub> or A<sub>1</sub>A<sub>0</sub>, and so on.
- A<sub>i</sub> must be written before writing A<sub>j</sub>, for every i < j.
- For a move in which you write a number A<sub>i</sub> (i>0), your points increase by the product of A<sub>i</sub> and its neighbour. 
(Note that for any move it will have only one neighbour as you write the number at an end).
- Total score of a game is the score you attain after placing all the N + 1 numbers.

Princess Rupsa wants to find out the sum of scores obtained by all possible different gameplays. 
Two gameplays are different, if after writing down all N + 1 numbers, when we read from left to right, there exists 
some position i, at which the gameplays have a<sub>j</sub> and a<sub>k</sub> written at the ith position such that j ≠ k. 
But since she has recently found her true love, a frog Prince, and is in a hurry to meet him, you must help her solve the 
problem as fast as possible. Since the answer can be very large, print the answer modulo 10<sup>9</sup> + 7.

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- The first line of each test case contains a single integer N.
- The second line contains N + 1 space-separated integers denoting A<sub>0</sub> to A<sub>N</sub>.

## Output

- For each test case, output a single line containing an integer denoting the answer.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

2

1

1 2

2

1 2 1

### Output:

4

14

## Explanation

There are 2 possible gameplays. 
A<sub>0</sub>A<sub>1</sub> which gives score of 2 and A<sub>1</sub>A<sub>0</sub> which also gives score of 2. 
So the answer is 2 + 2 = 4
