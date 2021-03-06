# Eidi Gift

Eidi gifts are a tradition in which children receive money from elder relatives during the Eid celebration.

Chef has three children (numbered 1,2,3) and he wants to give them Eidi gifts. 
The oldest child, Chefu, thinks that a distribution of money is fair only if an older child 
always receives more money than a younger child; if two children have the same age, they should receive the same amounts of money.

For each valid i, the i-th child is A<sub>i</sub> years old and it received C<sub>i</sub> units of money. 
Determine whether this distribution of money is fair.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains six space-separated integers A<sub>1</sub>, A<sub>2</sub>, A<sub>3</sub>, C<sub>1</sub>, C<sub>2</sub> and C<sub>3</sub>.

## Output

For each test case, print a single line containing the string "FAIR" if the distribution is fair or "NOT FAIR" otherwise.

## Constraints

- 1≤T≤1,000
- 1≤A<sub>1</sub>,A<sub>2</sub>,A<sub>3</sub>≤17
- 1≤C<sub>1</sub>,C<sub>2</sub>,C<sub>3</sub>≤100

## Example

### Input:

5

5 7 10 10 20 50

5 5 5 20 10 20

10 1 17 5 10 15

3 6 3 8 10 9

8 5 5 50 10 10

### Output:

FAIR

NOT FAIR

NOT FAIR

NOT FAIR

FAIR

## Explanation

### Case 2

All children have same age which is 5, but second child got less money than the other children, so it's not fair.

### Case 3

First child is older than second child but he got less money than him, so it's not fair.

### Case 4

First and third children have same age, but didn't get same amount of money, so it's not fair.
