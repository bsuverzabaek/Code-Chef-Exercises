# Sed Sequences

The special task force Sed managed to obtain a sequence of positive integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

You may perform the following operation any number of times (possibly zero):

- Choose any element of the current sequence and replace it by any positive integer.

You need to make the sum of the elements of the sequence divisible by a given positive integer K. 
Find the minimum number of operations you need to perform to achieve this.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

For each test case, print a single line containing one integer ― the minimum required number of operations.

## Constraints

- 1≤T≤1,000
- 1≤N≤100
- 1≤K≤10<sup>5</sup>
- 1≤A<sub>i</sub>≤10<sup>5</sup> for each valid i

## Example

### Input:

3

3 2

1 1 1

3 3

1 1 1

5 5

1 2 3 4 5

### Output:

1

0

0

## Explanation

### Case 1

Initially, 1+1+1=3 is not divisible by K=2. We can change A<sub>1</sub> to 2. Now, 2+1+1=4 is divisible by K.

### Case 2

For the initial sequence A, 1+1+1=3 is already divisible by K=3, so no operations are required.

### Case 3

Again, for the initial sequence A, 1+2+3+4+5=15 is already divisible by K=5, so no operations are required.
