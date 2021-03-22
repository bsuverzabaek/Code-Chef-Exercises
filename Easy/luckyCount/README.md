# Lucky Count

Chef loves lucky numbers. 
Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. 
For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Let F<sub>d</sub>(x) equals to the number of digits d in decimal representation of the positive integer x. 
Chef interests only in functions F<sub>4</sub>(x) and F<sub>7</sub>(x). 
For the given positive integer N he wants to know the total number of 
different pairs (L; R) such that F<sub>4</sub>(L) + F<sub>4</sub>(L + 1) + ... + F<sub>4</sub>(R) equals 
to F<sub>7</sub>(L) + F<sub>7</sub>(L + 1) + ... + F<sub>7</sub>(R) and 1 ≤ L ≤ R ≤ N.

## Input

- The first line contains a single positive integer T, the number of test cases. T test cases follow. 
- The only line of each test case contains a positive integer N .

## Output

For each test case, output a single line containing the answer for the corresponding test case.

## Constraints

- 1 ≤ T ≤ 100000
- 1 ≤ N ≤ 100000

## Example

### Input:

3

3

10

100

### Output:

6

31

1266
