# Simple Statistics

Sergey has made N measurements. Now, he wants to know the average value of the measurements made.

In order to make the average value a better representative of the measurements, before calculating the average, he wants first to remove 
the highest K and the lowest K measurements. After that, he will calculate the average value among the remaining N - 2K measurements.

Could you help Sergey to find the average value he will get after these manipulations?

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and K denoting the number of 
measurements and the number of the greatest and the lowest values that will be removed.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the measurements.

## Output

For each test case, output a single line containing the average value after removing K lowest and K greatest measurements.
Your answer will be considered correct, in case it has absolute or relative error, not exceeding 10<sup>-6</sup>.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 10<sup>4</sup>
- 0 ≤ 2K < N
- -10<sup>6</sup> ≤ A<sub>i</sub> ≤ 10<sup>6</sup>

## Example

### Input:

3

5 1

2 9 -10 25 1

5 0

2 9 -10 25 1

3 1

1 1 1

### Output:

4.000000

5.400000

1.000000

## Explanation

### Case 1

After removing 1 greatest and 1 lowest measurement, we get the set {2, 9, 1}. The average value in this set is (2+9+1)/3=4

### Case 2

The average value in the set {2, 9, -10, 25, 1} is (2+9-10+25+1)/5=5.4

### Case 3

After removing the 1 largest and smallest measurements, Sergey will be left with only one measurement, i.e. 1. Average of this is 1 itself.
