# Highest Divisor

You are given an integer N. Find the largest integer between 1 and 10 (inclusive) which divides N.

## Input

The first and only line of the input contains a single integer N.

## Output

Print a single line containing one integer ― the largest divisor of N between 1 and 10.

## Constraints

- 2≤N≤1,000

## Example

### Input:

24

### Output:

8

### Input:

91

### Output:

7

## Explanation

### Case 1

The divisors of 24 are 1,2,3,4,6,8,12,24, out of which 1,2,3,4,6,8 are in the range [1,10]. Therefore, the answer is max(1,2,3,4,6,8)=8.

### Case 2

The divisors of 91 are 1,7,13,91, out of which only 1 and 7 are in the range [1,10]. Therefore, the answer is max(1,7)=7.
