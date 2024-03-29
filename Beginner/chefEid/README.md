# Chef and Eid

During Eid, it's a tradition that each father gives his kids money which they can spend on entertainment.

Chef has N coins; let's denote the value of coin i by v<sub>i</sub>. 
Since today is Eid, Chef is going to give one coin to each of his two children. 
He wants the absolute value of the difference between the values of coins given to the two 
children to be as small as possible, so that he would be as fair as possible.

Help Chef by telling him the minimum possible difference between the values of the coins given to the two children. 
Of course, Chef cannot give the same coin to both children.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers v<sub>1</sub>,v<sub>2</sub>,…,v<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the minimum possible difference.

## Constraints

- 1≤T≤100
- 2≤N≤10<sup>5</sup>
- The sum of N in all test cases does not exceed 5⋅10<sup>5</sup>
- 1≤v<sub>i</sub>≤10<sup>6</sup> for each valid i

## Example

### Input:

2

3

1 4 2

3

1 3 3

### Output:

1

0

## Explanation

### Case 1

Chef gives the coin with value 1 to his first child and the coin with value 2 to the second child, so the answer is 2−1=1.

### Case 2

Chef gives each of his children a coin with value 3, so the difference is 0.
