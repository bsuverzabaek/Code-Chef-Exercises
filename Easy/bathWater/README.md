# Bathwater

It's winter and taking a bath is a delicate matter. Chef has two buckets of water. 
The first bucket has v<sub>1</sub> volume of cold water at temperature t<sub>1</sub>. 
The second has v<sub>2</sub> volume of hot water at temperature t<sub>2</sub>. 
Chef wants to take a bath with at least v<sub>3</sub> volume of water which is at exactly t<sub>3</sub> temperature. 
To get the required amount of water, Chef can mix some water obtained from the first and second buckets.

Mixing v<sub>x</sub> volume of water at temperature t<sub>x</sub> with v<sub>y</sub> volume of water at 
temperature t<sub>y</sub> yields v<sub>x</sub>+v<sub>y</sub> volume of water at temperature calculated as



Help Chef figure out if it is possible for him to take a bath with at 
least v<sub>3</sub> volume of water at temperature t<sub>3</sub>.

Assume that Chef has no other source of water and that no heat is 
lost by the water in the buckets with time, so Chef cannot simply wait for the water to cool.

## Input

- The first line contains n, the number of test cases. n cases follow.
- Each testcase contains of a single line containing 
6 integers v<sub>1</sub>,t<sub>1</sub>,v<sub>2</sub>,t<sub>2</sub>,v<sub>3</sub>,t<sub>3</sub>.

## Output

For each test case, print a single line containing "YES" if Chef can take a bath the way he wants and "NO" otherwise.

## Constraints

- 1≤n≤10<sup>5</sup>
- 1≤v<sub>1</sub>,v<sub>2</sub>,v<sub>3</sub>≤10<sup>6</sup>
- 1≤t<sub>1</sub><t<sub>2</sub>≤10<sup>6</sup>
- 1≤t<sub>3</sub>≤10<sup>6</sup>

## Example

### Input:

3

5 10 5 20 8 15

5 10 5 20 1 30

5 10 5 20 5 20

### Output:

YES

NO

YES

## Explanation

### Case 1

Mixing all the water in both buckets yields 10 volume of water at temperature 15, which is more than the required 8.

### Case 2

It is not possible to get water at 30 temperature.

### Case 3

Chef can take a bath using only the water in the second bucket.
