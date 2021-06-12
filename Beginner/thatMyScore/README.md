# That is My Score!

You are participating in a contest which has 11 problems (numbered 1 through 11). 
The first eight problems (i.e. problems 1,2,…,8) are scorable, while the last 
three problems (9, 10 and 11) are non-scorable ― this means that any submissions you make on any of these problems do not affect your total score.

Your total score is the sum of your best scores for all scorable problems. 
That is, for each scorable problem, you look at the scores of all submissions you made on that 
problem and take the maximum of these scores (or 0 if you didn't make any submissions on that problem); the total score 
is the sum of the maximum scores you took.

You know the results of all submissions you made. Calculate your total score.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N denoting the number of submissions you made.
- N lines follow. For each i (1≤i≤N), the i-th of these lines contains two space-separated integers p<sub>i</sub> and s<sub>i</sub>, denoting 
that your i-th submission was on problem p<sub>i</sub> and it received a score s<sub>i</sub>.

## Output

For each test case, print a single line containing one integer ― your total score.

## Constraints

- 1≤T≤10
- 1≤N≤1,000
- 1≤p<sub>i</sub>≤11 for each valid i
- 0≤s<sub>i</sub>≤100 for each valid i

## Example

### Input:

2

5

2 45

9 100

8 0

2 15

8 90

1

11 1

### Output:

135

0

## Explanation

### Case 1

The scorable problems with at least one submission are problems 2 and 8. 
For problem 2, there are two submissions and the maximum score among them is 45. 
For problem 8, there are also two submissions and the maximum score is 90. Hence, the total score is 45+90=135.

### Case 2

No scorable problem is attempted, so the total score is 0.
