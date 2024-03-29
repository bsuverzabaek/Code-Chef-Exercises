# Jalebi Bai and Decks of Sweets

Jalebi Bai has two decks of sweets. These decks are represented by two strings s and t consisting of lowercase letters from the English alphabet. 
Each letter from 'a' to 'z' denotes a single type of sweet, e.g., ‘b’ denotes Barfi, 'r' denotes Rasgulla, etc. 
She wants to use these decks in her friend Laddu’s marriage. 
Instead of graciously accepting the gift, Laddu asks Jalebi Bai to first make the two decks exactly the same, so that they look good while serving. 
Now Jalebi Bai can apply the following operation as many times as she wants on both the decks.

- From a single deck, pick any two consecutive sweets of the same type and eat one of them. 
e.g., if a deck is "rrrjj", she can change it to "rrrj" by picking the last two sweets of type 'j' (Jalebi) and eating one of them, or she can 
change the deck to "rrjj" by picking up the first two sweets of type ‘r’ and eating one of them.

You need to tell whether Jalebi Bai can make the decks equal by applying the above operation as many times as she wants. Output "Yes" [without quotes] if she can, otherwise output "No" [without quotes].

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a string s.
- The second line of each test case contains a string t.

## Output

For each test case, output "Yes" [without quotes] or "No" [without quotes] depending on the case.

## Constraints

- 1 ≤ T ≤ 50
- Each character of s, t will be between 'a' and 'z'.
- 1 ≤ length of string s ≤ 50
- 1 ≤ length of string t ≤ 50

## Example

### Input:

2

rrrjj

rrrj

rj

jr

### Output:

Yes

No

## Explanation

### Case 1

In the first example, Jalebi Bai can change the first deck from "rrrjj" to "rrrj" in a single operation, then both the decks will be equal. 
Example taken from the statements.

### Case 2

In the second example, Jalebi Bai can never make both decks of sweets equal.
