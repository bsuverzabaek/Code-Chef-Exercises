# Expected Xor

Monisha likes to paint. She has painted N paintings (numbered 1 through N) and wants to choose some subset of these paintings for an exhibition. 
For each valid i, the i-th painting has beauty b<sub>i</sub> and the probability that it will be displayed at the exhibition is p<sub>i</sub>. 
Each painting is chosen or excluded from the exhibition independently randomly.

The beauty of the resulting exhibition is the bitwise XOR of the beauties of all displayed paintings. If no paintings are displayed, the XOR is 0.

Monisha wants to find out how beautiful her exhibition is going to be. Help her compute the expected value of the beauty of the exhibition.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers b<sub>1</sub>,b<sub>2</sub>,…,b<sub>N</sub>.
- The third line contains N space-separated real numbers p<sub>1</sub>,p<sub>2</sub>,…,p<sub>N</sub>. 

Each of these numbers is given with at most five digits after the decimal point.

## Output

For each test case, print a single line containing one real number — the expected beauty of the exhibition. 
Your answer will be considered correct if its absolute or relative error does not exceed 10<sup>−6</sup>.

## Constraints

- 1≤N≤10<sup>5</sup>
- 0≤b<sub>i</sub>≤10<sup>9</sup> for each valid i
- 0≤p<sub>i</sub>≤1 for each valid i
- The sum of N over all test cases does not exceed 4⋅10<sup>5</sup>

## Example

### Input:

2

3

5 6 2

1.0 0.0 0.5

4

2 2 2 2

0.5 0.5 0.5 0.5

### Output:

6.000000000000000

1.000000000000000

## Explanation

### Case 1

The first painting must be displayed at the exhibition, the second one must be excluded. 
If the third painting is displayed (with probability 0.5), the beauty is 5⊕2=7; if it is excluded (with probability 0.5), the beauty is 5. 
The expected beauty is 0.5⋅5+0.5⋅7=6.

### Case 2

If there is an odd number of paintings at the exhibition, the beauty is 2; this has a probability of 0.5. 
If there is an even number of paintings, the beauty is 0 (with probability 0.5), so the expected beauty is 0.5⋅0+0.5⋅2=1.
