# Magician Versus Chef 2

The last time in Byteland, Chef defeated the magician in his challenge and won a gold coin.

The magician does not want to give up his coin so easily, so he gives Chef N coins. 
One of them is real and the remaining N−1 are fake; all fake coins have equal weights, different from the weight of the real coin. 
The coins are otherwise indistinguishable.

Chef has to find the real coin by himself. To make it fair, the magician gives Chef a balance. 
The balance is magical — it stays balanced when the sums of weights of 
coins put on each side are equal, but if they are not equal, the balance tilts to a random side instead of the side with the greater sum of weights. 
Chef can only use this balance up to K times; if he cannot uniquely determine which coin is the 
real one afterwards, he has to guess the real coin (he may make a guess in any way he wants).

If Chef uses the balance optimally, what is the minimum possible probability that he will correctly determine the real coin at the end? 
We are interested in the worst-case scenario where the position of the gold coin is fixed initially (but unknown to Chef).

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains two space-separated integers N and K.

## Output

For each test case, print a single line containing one integer — the minimum probability that Chef will find the gold coin. 
Your output will be considered correct if its absolute error does not exceed 10<sup>−6</sup>.

## Constraints

- 1≤T≤2⋅10<sup>5</sup>
- 1≤N≤10<sup>18</sup>
- 0≤K≤10<sup>9</sup>

## Example

### Input:

4

3 1

3 2

4 1

1 5

### Output:

0.500000

1.000000

0.500000

1.000000

## Explanation

### Case 1

Chef takes two coins and puts them on the two sides of the balance. 
If the balance tilts, then one of these two coins is real. 
(Otherwise, they are both fake and Chef found the real coin; we do not consider this scenario, since it does not lead to the minimum probability.) 
Chef cannot use the balance any more, so he cannot determine which of these two coins is the real one. 
He has to guess one; this guess is correct with probability 1/2.

### Case 2

The first use of the balance is the same as before. If the balance does not tilt, he knows the real coin. 
Otherwise, Chef replaces one coin on the balance. If the balance tilts again, the coin that was not replaced is the real one. 
Otherwise, the replaced coin is the real one.
