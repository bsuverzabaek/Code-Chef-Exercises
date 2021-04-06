# Good Pairs

You are given N integers: A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>. 
You need to count the number of pairs of indices (i, j) such that 1 ≤ i < j ≤ N and A<sub>i</sub> | A<sub>j</sub> ≤ max(A<sub>i</sub>, A<sub>j</sub>).

## Input

- The first line of the input contains an integer T, denoting the number of test cases. The description of each testcase follows.
- The first line of each testcase contains a single integer: N
- The second line of each testcase contains N integers: A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>.

## Output

For each test case, output a single line containing the answer for that test case.

## Constraints

- 1 ≤ T ≤ 20
- 1 ≤ N ≤ 10<sup>6</sup>
- 0 ≤ A<sub>i</sub> ≤ 10<sup>6</sup>
- 1 ≤ Sum of N over all test cases ≤ 10<sup>6</sup>

## Example

### Input:

1

3

1 2 3

### Output:

2

## Explanation

There are three possible pairs of indices which satisfy 1 ≤ i < j ≤ N: (1, 2), (1, 3) and (2, 3). 
Let us see which of those satisfy A<sub>i</sub> | A<sub>j</sub> ≤ max(A<sub>i</sub>, A<sub>j,/sub>):

- (1, 2): A<sub>1</sub> | A<sub>2</sub> = 1 | 2 = (01)2 | (10)2 = (11)2 = 3. 
But max(A<sub>1</sub>, A<sub>2</sub>) = max(1, 2) = 2, and 3 ≤ 2 is not correct. Hence this is not a valid pair.
- (1, 3): A<sub>1</sub> | A<sub>3</sub> = 1 | 3 = (01)2 | (11)2 = (11)2 = 3. 
And max(A<sub>1</sub>, A<sub>3</sub>) = max(1, 3) = 3, and 3 ≤ 3 is correct. Hence this is a valid pair.
- (2, 3): A<sub>2</sub> | A<sub>3</sub> = 2 | 3 = (10)2 | (11)2 = (11)2 = 3. 
And max(A<sub>2</sub>, A<sub>3</sub>) = max(2, 3) = 3, and 3 ≤ 3 is correct. Hence this is a valid pair.

So there are a total of 2 valid pairs, and hence the answer is 2.
