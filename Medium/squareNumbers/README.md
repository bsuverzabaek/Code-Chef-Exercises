# Square in Numbers

Leha is a bright mathematician. Today he is investigating whether an integer is divisible by some square number or not.

He has a positive integer X represented as a product of N integers a<sub>1</sub>, a<sub>2</sub>, .... a<sub>N</sub>. 
He has somehow figured out that there exists some integer P such that the number X is divisible by P<sup>2</sup>, but he is not able to find such P himself. 
Can you find it for him? If there are more than one possible values of P possible, you can print any one of them.

## Input

- The first line of the input contains an integer T denoting the number of test cases. T test cases follow.
- The first line of each test case contains one integer N denoting the number of intgers in presentation of X.
- The second line contains N space-separated integers a<sub>1</sub>, a<sub>2</sub>, .... a<sub>N</sub>.

## Output

For each test case, output a single integer P deoting the answer for this test case. 
Note that P must be in range from 2 to 10<sup>18</sup> inclusive. It's guaranteed that at least one answer exists. 
If there are more than one possible answers, print any.

## Constraints

- 1 ≤ T ≤ 5
- 1 ≤ N ≤ 100
- 1 ≤ a<sub>i</sub> ≤ 10<sup>18</sup>

## Example

### Input:

1

3

21 11 6

### Output:

3

## Explanation

### Case 1

X = 21 * 11 * 6 = 1386. It's divisible by 9 which is a square number, as 9 = 32. So P = 3.
