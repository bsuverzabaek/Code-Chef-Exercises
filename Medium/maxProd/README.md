# Maximize Product

You are given two integers N and K. 
Consider all ways to represent N as the sum of exactly K distinct positive integers x<sub>1</sub>,x<sub>2</sub>,…,x<sub>K</sub> — in other words, x<sub>i</sub>>0
for each valid i, x<sub>i</sub>≠x<sub>j</sub> for each valid i≠j and x<sub>1</sub>+x<sub>2</sub>+…+x<sub>K</sub>=N should hold.

You have to find the maximum possible value of the 
product (x<sup>2</sup><sub>1</sub>−x<sub>1</sub>)⋅(x<sup>2</sup><sub>2</sub>−x<sub>2</sub>)⋅…⋅(x<sup>2</sup><sub>K</sub>−x<sub>K</sub>). 
Because this number could be huge, compute it modulo 10<sup>9</sup>+7. 
If N cannot be represented as the sum of any K distinct positive integers, output −1 instead.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains two space-separated integers N and K.

## Output

For each test case, print a single line containing one integer — the maximum product, or −1 if N cannot be represented in the given way.

## Constraints

- 1≤T≤1,000
- 1≤N≤10<sup>9</sup>
- 1≤K≤10<sup>4</sup>

## Example

### Input:

2

5 2

6 2

### Output:

12

24

## Explanation

### Case 1

We want two distinct positive integers whose sum is 5. There are only two possibilities: (1,4) and (2,3). 
The corresponding products are (1<sup>2</sup>−1)⋅(4<sup>2</sup>−4)=0 and (2<sup>2</sup>−2)⋅(3<sup>2</sup>−3)=2⋅6=12. 
The maximum is 12, which is the answer.

### Case 2

We want two distinct positive integers whose sum is 6. There are only two possibilities again: (1,5) and (2,4). 
Their corresponding products are 0 and 24 and the maximum is 24.
