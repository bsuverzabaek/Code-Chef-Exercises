# Mix Mix Game

Vanja and Miksi really like games. After playing one game for a long time, they decided to invent another game!

In this game, they have a sequence A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub> and two numbers Z<sub>1</sub> and Z<sub>2</sub>. 
The rules of the game are as follows:

The players take turns alternately, starting with Vanja.
There is an integer S; at the beginning, S=0.
In each turn, the current player must choose an arbitrary element of A and either add that number to S or subtract it from S. 
Each element can be selected multiple times.
Afterwards, if S=Z<sub>1</sub> or S=Z<sub>2</sub>, the current player (the player who made S equal to Z<sub>1</sub> or Z<sub>2</sub>) is the winner of the game.
If the game lasts for 10<sup>10</sup> turns, Vanja and Miksi decide to declare it a tie.
Can you help the boys determine the winner of the game? 
Please note that the game can end in a tie (if nobody can make S=Z<sub>1</sub> or S=Z<sub>2</sub> in the first 10<sup>10</sup> moves).

Both players play optimally, i.e. if there is a move which guarantees the current player's victory 
regardless of the other player's moves, the current player will make such a move. 
If the current player cannot win and there is a move which guarantees that the game will end in a tie, the current player will make such a move.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains three space-separated integers N, Z<sub>1</sub>, and Z<sub>2</sub>.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the final result of the game:
- 1 if Vanja (the first player) has a winning strategy
- 2 if Miksi (the second player) has a winning strategy
- 0 if the game ends in a tie

## Constraints

- 1≤T≤50
- 1≤N≤50
- |Z<sub>1</sub>|,|Z<sub>2</sub>|≤10<sup>9</sup>
- |A<sub>i</sub>|≤10<sup>9</sup> for each valid i

## Example

### Input:

3

2 6 4

-4 10

1 1 -1

2

2 0 7

3 4

### Output:

1

0

2

## Explanation

### Case 1

The first player can choose the value A<sub>1</sub>=−4, subtract it from S=0 and obtain S=−(−4)=4=Z2. 
The winner is the first player.

### Case 2

It can be proven that neither player is able to reach S=Z<sub>1</sub> or S=Z<sub>2</sub>. 
The result is a tie.
