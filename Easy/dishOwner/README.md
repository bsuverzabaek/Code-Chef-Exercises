# Dish Owner

This summer, there is a worldwide competition being held in Chef Town and some of the best chefs of the world are participating. 
The rules of this competition are quite simple.

Each participant needs to bring his or her best dish. The judges will initially assign a score to each of the dishes. 
Now, several rounds will follow. In each round, any two chefs will be called up on the stage. 
Each of the chefs can then choose any one dish to battle against the other chef and the one having the dish with the higher score will win this round. 
The winner of the round will also obtain all the dishes of the loser who will then be eliminated. 
In case both the dishes have equal scores, this round will be considered as a tie and nothing else will happen. 
Note that initially each chef will have only one dish and all the chefs play the rounds optimally.

Your task is to simulate and answer some queries related to this. 
You will be given N dishes numbered from 1 to N with the i<sup>th</sup> dish belonging to the ith chef initially. 
You will also be given an array S where S[i] denotes the score given by the judges to the i<sup>th</sup> dish before starting the rounds. 
You will have to answer Q queries, each of which can be of the following types : 

1. **0 x y** : This denotes that the chef containing dish number x competes with the chef containing dish number y currently in this round. 
If a single chef is the owner of both the dishes, print "**Invalid query!**" (without quotes), otherwise execute and store the result of this round as described by the rules above. 

2. **1 x** : You need to output the index of the chef containing dish x at this point.

## Input

- The first line of input contains an integer T, denoting the number of test cases. 
- For each test case, the first line contains an integer N denoting the number of chefs in the contest. 
- The next line contains N space separated integers where the ith integer represents S[i]. 
- The next line contains an integer Q denoting the number of queries. 
- Q lines follow where each line can be of the format **0 x y** or **1 x** as described in the problem statement.

## Output

For each test, print in each line the answer for the queries as described in the problem statement .

## Constraints

- 1 ≤ T ≤ 25
- 1 ≤ N ≤ 10000(10<sup>4</sup>)
- 0 ≤ S[i] ≤ 1000000(10<sup>6</sup>)
- 1 ≤ Q ≤ 10000(10<sup>4</sup>)
- 1 ≤ x, y ≤ N

## Example

### Input:

1

2

1 2

2

0 1 2

1 1

### Output:

2

## Explanation

There are two chefs with scores of dishes 1 and 2 respectively. 
After the first query, chef 2 acquires dish 1 since S[2] > S[1] . 
Hence, the answer for the second query, i.e owner of the first dish is chef 2.