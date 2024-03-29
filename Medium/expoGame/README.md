# Exponential Game

Little Chef is trying to learn exponents. He is especially interested in a number raised to the power of itself. 
Head Chef being his mentor has decided to give him a two player game to play. The game is as follows: You are given n piles of stones. 
The piles have a<sub>1</sub>, a<sub>2</sub> .. a<sub>n</sub> number of stones . 
Each player on his/her turn can remove x number of stones where x = n^n (for some natural number n > 0) from any one pile. 
The player who is unable to move loses. 
Head Chef is playing this game with the Little Chef and being senior he gives the first move to the Little Chef .

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N denoting the number of piles. 
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the number of stones in each pile.

## Output

For each test case, output a single line containing the string "Head Chef" if Head Chef will 
win the game or the string "Little Chef" is Little Chef will win the game (assuming optimal play by both players).

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- 1 ≤ a<sub>i</sub> ≤ 100000

## Example

### Input:

1

1

4

### Output:

Little Chef

## Explanation

### Case 1

Little Chef can remove all the four stones and Head Chef will lose.
