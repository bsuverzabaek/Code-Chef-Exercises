# Pouring Water

Given two vessels, one of which can accommodate A liters of water and the other which can 
accommodate B liters of water, determine the number of steps required to obtain exactly C liters of water in one of the vessels.

At the beginning both vessels are empty. The following operations are counted as 'steps':
- Emptying a vessel
- Filling a vessel
- Pouring water from one vessel to the other, without spilling, until one of the vessels is either full or empty

## Input

- An integer t, denoting the number of test cases
- Followed by t sets of input data, each consisting of three positive 
integers a (the number of liters the first container can hold), b (the number of liters the second container can hold), 
and c (the final amount of liters of water one vessel should contain), given in separate lines.

## Output

For each set of input data, output the minimum number of steps required to obtain c liters, or -1 if this is impossible.

## Constraints

- 1<=t<=100
- a,b,c not larger than 40000

## Example

### Input:

2

5

2

3

2

3

4

### Output:

2

-1
