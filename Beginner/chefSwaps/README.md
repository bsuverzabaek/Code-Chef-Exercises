# Chef Swaps Digits

Chef has two positive integers A and B. 
He can tamper with them by choosing a digit in the decimal representation of A and a digit in the decimal representation of B and swapping these digits. 
This operation may be performed at most once.

Find the maximum possible sum of the resulting numbers which Chef can obtain.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains two space-separated integers A and B.

## Output

For each test case, print a single line containing one integer ― the maximum sum.

## Constraints

- 1≤T≤1,000
- 1≤A,B≤99

## Example

### Input:

3

13 82

9 24

20 30

### Output:

104

96

50

## Explanation

### Case 1

Swapping the digits 1 (from 13) and 2 (from 82) gives us 23 and 81. Their sum 23+81=104 is the maximum possible sum.

### Case 3

Swapping is not needed as the original numbers have the maximum possible sum.
