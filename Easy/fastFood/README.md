# Fast Food

Chef owns a fast food shop that is currently located in a city called Chefland. 
He is planning to move his shop to a bigger city called Chefabad. 
There are N consecutive days (numbered 1 through N) such that the move can be done before day 1, after day N or between any two consecutive days. 
Moving the shop takes zero time. Chef wants to time the move in a way thay maximises his profit during these N days.

For each i (1≤i≤N), we know that if Chef's shop is in Chefland on the i-th day, 
he earns A<sub>i</sub> coins, while if it is in Chefabad on this day, he earns B<sub>i</sub> coins. 
Find the maximum profit Chef can make if he optimally chooses the time when the shop should move. 
Note that once the shop has moved to Chefabad, it cannot return to Chefland.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.
- The third line contains N space-separated integers B<sub>1</sub>,B<sub>2</sub>,…,B<sub>N</sub>.

## Output

For each test case, print a single line containing one integer ― the maximum profit.

## Constraints

- 1≤T≤1,000
- 1≤N≤10<sup>5</sup>
- 1≤A<sub>i</sub>,B<sub>i</sub>≤10<sup>4</sup> for each valid i
- The sum of N over all test cases does not exceed 10<sup>6</sup>

## Example

### Input:

3

3

2 3 2

10 3 4

4

7 5 3 4

2 3 1 3

2

10 1

1 10

### Output:

17

19

20

## Explanation

### Case 1

The best time to move is before the first day.

### Case 2

The best time to move is after the last day.

### Case 3

The best time to move is after the first day.
