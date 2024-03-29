# Yet Another Card Game

You are playing a game with a deck of r red cards and b blue cards. You are also given p red tokens and r+b-p blue tokens. (0 ≤ p ≤ r+b).

You will now play a game with r+b turns. 
On the i-th turn, you choose one of your tokens, then choose a random card from the deck uniformly at random. 
You earn a point if the color of the token matches the color of the card. 
Otherwise, your score doesn’t change. Afterwards, both the token and the card will get discarded.

Compute the expected value of your score, assuming you play optimally. 
Note, it is allowed to adjust your strategy based on how many red or blue cards you have seen in previous turns.

## Input

- The first line of input will contain an integer T, the number of test cases.
- The only line of each test case will contain three space separated integers r, b, p.

## Output

For each test case, output a single floating point value, the expected score you will get assuming you play optimally in a new line. 
Your answer will be accepted if it has absolute or relative error at most 10<sup>-6</sup>.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ r, b ≤ 100,000
- 0 ≤ p ≤ r+b

## Example

### Input:

5

3 1 2

1 6 7

2 3 4

15 14 13

100000 100000 0

### Output:

2.0000000000

1.0000000000

2.2000000000

14.4482758621

100000.0000000000

## Explanation

### Case 1

We have three red cards, one blue card, two red tokens, and two blue tokens. 
An optimal strategy is to choose the red token first. There are two cases. 
Either the card we choose first is red or blue. 
If it is blue, then we know for sure all remaining cards will be red, so it doesn't matter how we play the remaining tokens. 
This gives us 1 point. If it is red, then we will next play our last red token. 
We can check that the expected value of our score is equal to 2, and there is no other strategy that is strictly better.
