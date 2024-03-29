# Moving Coins

There is a line with 1000 cells numbered from 1 to 1000 from left to right and N coins placed on it. 
Coin i is placed at cell X<sub>i</sub>, and no two coins are placed at the same cell.

Bob would like to move the coins to the N leftmost cells of the line. 
To do this, he is allowed to take a coin from any cell T and move it to cell T-j, where j is an integer between 1 and K, inclusive. 
This action is possible only if:

- cell T-j actually exists and doesn't contain a coin;
- each of the cells T-j+1, ..., T-1 contains a coin.

One coin movement takes exactly one second. Find the smallest time in which Bob can achieve his goal.

## Input

- The first line of the input file contains one integer T -- the number of test cases (no more than 10). 
- Then T test cases follow, and every test case is described by two lines: the first of them contains two 
integers N and K (1 <= N, K <= 1000), the second of them contains N integers X1, ..., XN in strictly increasing order (1 <= Xi <= 1000).

## Output

For each test case output one line containing the requested minimal time for Bob to put all the coins to the left side of the line.

## Example

### Input:

2

3 2

2 4 7

5 3

1 2 3 4 5

### Output:

5

0

## Explanation

### Case 1

Bob can move the coin from cell 7 consequently to cells 6, 5, 3 and 1, then move the coin from cell 4 to cell 3. 

### Case 2

There is nothing to move.
