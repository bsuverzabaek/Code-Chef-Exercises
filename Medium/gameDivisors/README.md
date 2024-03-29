# Game of Divisors

Mike and his friend Tom are playing a very interesting game right now. Here is the description of the game:

- Initially, there is a positive integer N written on the desk, which is strictly greater than 1;
- Mike makes the first move, then players make moves alternatively;
- On each move the current player can either decrease the number on the desk by 1, or divide it by one of it's divisors except itself and 1; 
It's forbidden to decrease the number if it's equal to 1;
- If the current player can't make a move, then he loses. In other words, if there is "1" written on the desk right before his move, then he loses.

You are given a number N. You need to determine the winner of the game, if N is the number written of the desk initially. 
You may assume, that both players play optimally.

## Input

- There are multiple test cases in the input. The first line of the input contains one integer T, denoting the number of test cases in the input.
- The next T lines contain one integer each, denoting the initial number of the game.

## Output

Your output should contain exactly T lines, each contains the name of the winner(Mike or Tom) of the corresponding game. 
You should output the verdicts of the games in the order they appear in the input.

## Constraints

- 1 ≤ T ≤ 10000
- 2 ≤ N ≤ 10<sup>8</sup>

## Example

### Input:

4 

5

3

2

4

### Output:

Tom

Tom

Mike

Mike
