# Chef Diet

Chef decided to go on a diet during the following N days (numbered 1 through N). 
Part of the diet plan is to eat K grams of protein during each day. 
For each valid i, Chef wants to buy A<sub>i</sub> grams of protein in the morning of the i-th day and then eat K grams of protein as part of his dinner. 
If he has any protein remaining, he can store it and use it in later dinners. 
Initially, Chef is storing 0 grams of protein.

Determine whether Chef will have enough protein all the time during his diet. 
In case he will not have enough, find the first day on which Chef will be unable to eat K grams of protein.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.

## Output

If Chef will have enough protein during his diet, print a single line containing the string "YES".
Otherwise, print a single line containing the string "NO", followed by a space and one integer — the first day when Chef will be unable to eat K grams of protein.

## Constraints

- 1≤T≤200
- 1≤N≤100
- 1≤K≤10<sup>6</sup>
- 1≤A<sub>i</sub>≤10<sup>6</sup> for each valid i

## Example

### Input:

3

4 5

7 3 6 5

3 4

3 10 10

3 4

8 1 1

### Output:

YES

NO 1

NO 3

## Explanation

### Case 1

On the first day, Chef buys 7 grams, eats 5 and stores 2 grams for later. 
On the second day, he buys 3 grams, so he has 5 grams, which is just enough for the dinner on this day. 
On the third day, he buys 6 grams, eats 5 and stores 1, and on the fourth day, he buys 5 grams, so he has 6 grams — enough for dinner. 
In the end, he had enough protein to eat during all four dinners.

### Case 2

Chef needs to eat 4 grams of protein on the first day, but he only has 3 grams, so he does not have a sufficient amount of protein already for the first dinner.
