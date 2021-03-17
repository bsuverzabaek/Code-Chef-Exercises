# Buddy NIM

Alice, Bob and Charlie are playing a new game called Buddy NIM. 
The game is played at two tables; on the first table, there are N heaps containing A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub> stones 
and on the second table, there are M heaps containing B<sub>1</sub>,B<sub>2</sub>,…,B<sub>M</sub> stones respectively.

Initially, Alice is playing at the first table and Bob is playing at the second table. 
The players take their turns in this order: Charlie, Alice, Bob, Charlie, etc.

Alice and Bob follow the rules for classical NIM - on Alice's turn, Alice must remove a positive number of stones 
from one of the piles at her current table and on Bob's turn, Bob must remove a positive number of stones from one of the piles at his current table. 
Whoever cannot remove any stone from a pile loses.

Charlie does not play at any table. Instead, on his turn, he decides if Alice and Bob should keep playing at their respective tables or swap places.

Alice and Charlie are buddies and they cooperate, playing in the optimal way that results in Alice's victory (if possible).

It is clear that either Alice or Bob wins the game eventually. You must find out who the winner will be.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each testcase contains two space-separated integers N and M.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub>.
- The third line contains M space-separated integers B<sub>1</sub>,B<sub>2</sub>,…,B<sub>M</sub>.

## Output

Print a single line containing the string "Alice" if Alice wins or "Bob" if Bob wins.

## Constraints

- 1≤T≤10<sup>2</sup>
- 1≤N,M≤10<sup>2</sup>
- 0≤A<sub>i</sub>≤10<sup>9</sup> for each valid i
- 0≤B<sub>i</sub>≤10<sup>9</sup> for each valid i

## Example

### Input:

3

3 1

1 1 1

3

3 1

1 2 4

7

1 1

1

1

### Output:

Alice

Alice

Bob