# Range AND

You are given positive integers L and R. You have to find the sum

<img width="238" alt="Screen Shot 2021-02-28 at 5 38 38 PM" src="https://user-images.githubusercontent.com/69542867/109439600-3e560680-79ec-11eb-9245-afe263cc283e.png">

where ∧ denotes the bitwise AND operation. Since the sum could be large, compute it modulo 10<sup>9</sup>+7.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains two space-separated integers L and R.

## Output

For each test case, print a single line containing one integer — the sum S modulo 10<sup>9</sup>+7.

## Constraints

- 1≤T≤10<sup>5</sup> 
- 1≤L≤R≤10<sup>18</sup>

## Example

### Input:

2

1 4

4 10

### Output:

1

16

## Explanation

### Case 1

The sum is 1 + 1 AND 2 + 1 AND 2 AND 3 + 1 AND 2 AND 3 AND 4 = 1 + 0 + 0 + 0 = 1.

### Case 2

The sum is 4 + 4 AND 5 + 4 AND 5 AND 6 + 4 AND 5 AND 6 AND 7 + … + 4 AND 5 AND … AND 10 = 4 + 4 + … + 0 = 16.
