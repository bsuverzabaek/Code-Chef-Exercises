# Secret Recipe

Chef and his competitor Kefa own two restaurants located at a straight road. 
The position of Chef's restaurant is X<sub>1</sub>, the position of Kefa's restaurant is X<sub>2</sub>.

Chef and Kefa found out at the same time that a bottle with a secret recipe is located on the road between their restaurants. 
The position of the bottle is X<sub>3</sub>.

The cooks immediately started to run to the bottle. Chef runs with speed V<sub>1</sub>, Kefa with speed V<sub>2</sub>.

Your task is to figure out who reaches the bottle first and gets the secret recipe (of course, it is possible that both cooks reach the bottle at the same time).

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains five space-separated integers X<sub>1</sub>, X<sub>2</sub>, X<sub>3</sub>, V<sub>1</sub>, and V<sub>2</sub>.

## Output

For each test case, print a single line containing the string "Chef" if Chef reaches the bottle first, "Kefa" if Kefa 
reaches the bottle first or "Draw" if Chef and Kefa reach the bottle at the same time (without quotes).

## Constraints

- 1≤T≤10<sup>5</sup>
- |X<sub>1</sub>|,|X<sub>2</sub>|,|X<sub>3</sub>|≤10<sup>5</sup>
- X<sub>1</sub><X<sub>3</sub><X<sub>2</sub>
- 1≤V<sub>1</sub>≤10<sup>5</sup>
- 1≤V<sub>2</sub>≤10<sup>5</sup>

## Example

### Input:

3

1 3 2 1 2

1 5 2 1 2

1 5 3 2 2

### Output:

Kefa

Chef

Draw

## Explanation

### Case 1

Chef and Kefa are on the same distance from the bottle, but Kefa has speed 2, while Chef has speed 1.
