# Magic Set

Katya has a sequence of integers a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub> and an integer m.

She defines a good sequence of integers as a non-empty sequence such that the sum of the elements in each of its non-empty subsequences is divisible by m.

Katya wants to know the number of good subsequences of the sequence a. Can you help her?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers n and m.
- The second line contains n space-separated integers a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub>.

## Output

For each test case, print a single line containing one integer — the number of good subsequences.

## Constraints

- 1≤T≤1,000 
- 1≤n≤30
- 1≤m≤1,000
- 1≤a<sub>i</sub>≤1,000 for each valid i

## Example

### Input:

2

2 3

1 2

2 3

1 3

### Output:

0

1

## Explanation

### Case 1

There are no good subsequences.

### Case 2

There is exactly one good subsequence of a: [3].
