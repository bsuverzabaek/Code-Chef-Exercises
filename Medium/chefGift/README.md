# Chef and Gift

Chef likes cooking. But more than that, he likes to give gifts. And now he wants to give his girlfriend an unforgettable gift. 
But unfortunately he forgot the password to the safe where the money he saved for the gift is kept.

But he knows how to hack the safe. To do this, you need to correctly answer questions asked by the embedded computer. 
The computer is very strange, and asks special questions, sometimes it can ask about 10000 question (really weird). 
Because of this, Chef wants you to write a program that will help him to crack the safe.
The questions are different, but there is only one type of question. 
Several numbers are given and between them one of three characters: *, +, - can be inserted. 
Note that in this case there is no priority for the operators, that is, if + is the before multiplication, you must first 
execute the operation of addition, and then multiplication (1 - 2 * 3 must be interpreted as (1 - 2) * 3 = -3 and not -5). 
The computer asks the minimum possible value of any valid expression.

## Input

- The first line of the input contains an integer T denoting the number of test cases. 
- The first line of each test case contains a positive integer N. 
- The second line contains N space separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the expression without the operators.

## Output

For each test case, output a single line containing the minimal value of given expression.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ N ≤ 10
- -9 ≤ A<sub>i</sub> ≤ 9

## Example

### Input:

2

3

1 2 3

1

9

### Output:

-4

9

## Explanation

### Case 1

1-2-3 = -4
