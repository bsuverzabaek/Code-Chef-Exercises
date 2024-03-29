# A Wolf, a Sheep, and Cabbage

The following is an easy game that the setter of this problem played when he was 8:

A boatman, a wolf, a sheep, and a cabbage are on the bank of a river. 
They have a small boat that is capable of carrying the boatman and at most one other animal/item with him. 
However, if left alone by the boatman, the wolf can eat the sheep, and the sheep can eat the cabbage. 
How can all four be moved safely to the opposite bank of the river?

This leads to a more general problem. 
If there are other groups of animals/items with the boatman, is it possible to move them all to the 
opposite bank of the river in such a way that nobody/nothing gets eaten?

We will give you the number of animals/items (not including the boatman). 
Moreover, we will give you all a list of pairs of the form "X Y" where the X-th animal/item will be 
eaten by the Y-th one if they are both on the opposite bank to the boatman.

You are to determine whether it is possible to achieve the task or not.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test contains two space separated integers N and M - the number of 
animals/items not including the boatman, and the number of relations of the form "X will be eaten by Y", respectively.
- The following M lines contain pairs of the form X Y with the meaning that the X-th animal/item will be 
eaten by the Y-th one if they are both on the opposite bank to the boatman.

## Output

For each test case, output a single line containing either "YES" or "NO" - the answer to the question "Is it possible to move 
them all to the opposite bank of the river in such a way that nobody/nothing gets eaten?".

## Constraints

- 1 ≤ T ≤ 100000
- 1 ≤ N ≤ 10
- 0 ≤ M ≤ 20

## Example

### Input:

2

3 2

1 2

2 3

3 3

1 2

2 3

1 3

### Output:

YES

NO

## Explanation

### Case 1

The first example is the original version of the problem.

### Case 2

The second example would have a solution if a boat could seat an additional animal/item.
