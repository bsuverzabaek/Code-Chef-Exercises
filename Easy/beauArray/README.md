# Beautiful Array

A sequence of integers is beautiful if each element of this sequence is divisible by 4.

You are given a sequence a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>. 
In one step, you may choose any two elements of this sequence, remove them from the sequence and append their sum to the sequence. 
Compute the minimum number of steps necessary to make the given sequence beautiful.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer n.
- The second line contains n space-separated integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>.

## Output

For each test case, print a single line containing one number — the minimum number of steps necessary to make the given sequence beautiful. 
If it's impossible to make the sequence beautiful, print -1 instead.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ sum of n over all test cases ≤ 10<sup>6</sup>
- 0 ≤ a<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

1

7

1 2 3 1 2 3 8

### Output:

3
