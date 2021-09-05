# Valid Pair

Chef has three socks in his drawer. Each sock has one of 10 possible colours, which are represented by integers between 1 and 10. 
Specifically, the colours of the socks are A, B, and C.

Chef has to wear two socks which have the same colour. Help Chef find out if that is possible or not.

## Input

- The first and only line of the input contains three space-separated integers A, B and C.

## Output

Print a single line containing the string "YES" if it is possible for Chef to wear two socks with the same colour or "NO" if it is impossible (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

## Constraints

- 1≤A,B,C≤10

## Example

### Input:

5 4 3

### Output:

NO

### Input:

5 5 5

### Output:

YES

## Explanation

### Case 1

Since there are no two socks with the same colour, Chef cannot wear a pair of socks with the same colour.

### Case 2

Since all three socks have the same colour, Chef can wear a pair of socks with the same colour.
