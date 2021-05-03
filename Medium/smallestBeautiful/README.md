# Smallest Beautiful Number

Let's call a positive integer M a beautiful number if the following conditions are satisfied:

- The decimal representation of M (without leading zeros) does not contain any zeros.
- The sum of squares of all decimal digits of M is a perfect square.

For example, 1, 4, and 221 are beautiful, but 10 and 333 are not.

You are given a positive integer N. Find the smallest N-digit beautiful number or determine that all N-digit integers are not beautiful.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single integer N.

## Output

For each test case, print a single line containing one integer ― the smallest N-digit beautiful number, or −1 if there is no such number.

## Constraints

- 1≤T≤100
- 1≤N≤10<sup>6</sup>
- The sum of N over all test cases does not exceed 10<sup>6</sup>

## Example

### Input:

2

1

2

### Output:

1

34

## Explanation

### Case 1

It is obvious that 1 is the smallest beautiful number.

### Case 2

34 is beautiful because 3<sup>2</sup>+4<sup>2</sup>=9+16=25=5<sup>2</sup>. On the other hand, we can prove that this is the smallest beautiful number.
