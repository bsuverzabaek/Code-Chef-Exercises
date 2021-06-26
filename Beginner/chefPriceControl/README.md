# Chef and Price Control

Chef has N items in his shop (numbered 1 through N); for each valid i, the price of the i-th item is P<sub>i</sub>. 
Since Chef has very loyal customers, all N items are guaranteed to be sold regardless of their price.

However, the government introduced a price ceiling K, which means that 
for each item i such that P<sub>i</sub>>K, its price should be reduced from P<sub>i</sub> to K.

Chef's revenue is the sum of prices of all the items he sells. Find the amount of revenue which Chef loses because of this price ceiling.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains N space-separated integers P<sub>1</sub>,P<sub>2</sub>,…,P<sub>N</sub>.

## Output

For each test case, print a single line containing one integer ― the amount of lost revenue.

## Constraints

- 1≤T≤100
- 1≤N≤10,000
- 1≤P<sub>i</sub>≤1,000 for each valid i
- 1≤K≤1,000

## Example

### Input:

3

5 4

10 2 3 4 5

7 15

1 2 3 4 5 6 7

5 5

10 9 8 7 6

### Output:

7

0

15

## Explanation

### Case 1

The initial revenue is 10+2+3+4+5=24. Because of the price ceiling, P<sub>1</sub> decreases from 10 to 4 and P<sub>5</sub> decreases from 5 to 4. 
The revenue afterwards is 4+2+3+4+4=17 and the lost revenue is 24−17=7.

### Case 2

The initial revenue is 1+2+3+4+5+6+7=28. 
For each valid i, P<sub>i</sub>≤15, so there are no changes, the revenue after introduction of the price ceiling is the same and there is zero lost revenue.

### Case 3

The initial revenue is 10+9+8+7+6=40. 
Since P<sub>i</sub>>5 for each valid i, the prices of all items decrease to 5. 
The revenue afterwards is 5⋅5=25 and the lost revenue is 40−25=15.
