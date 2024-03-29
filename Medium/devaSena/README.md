# Devasena

Devasena was the princess of an unknown kingdom (we'll all know which one, in Baahubali 2), and her father arranged for a Swayamvara to get her married. 
He gave all of them a question, and the question was so hard that nobody was able to answer it 
(Yes you guessed it right, both Baahubali and Bhallaladeva were not present there for the Swayamvara). 
We all know that Amarendra Baahubali married her later and as a consequence of so many things, she was imprisoned for 25 years. 
Who knows, if someone else had answered the question that day, then she would have got married to him and things could have been different. 
Phew! But the bad part, we wouldn't have had the story of Baahubali. :)

Although everything is history now, recently archaeologists discovered the secret 
question that was asked at the Swayamvara, and you think - "Well, it's such a simple question. I could use a computer to solve it!". 
The question goes as follows:

You are given N integers (not necessarily distinct) => A<sub>1</sub>, A<sub>2</sub>, A<sub>3</sub>, ..., A<sub>N</sub>. 
There are 2<sup>N</sup> possible subsets (including the empty subset). 
The GCD of a subset is defined as the greatest common divisor of all the integers in that subset. 
You need to find the product of the GCDs of all the 2<sup>N</sup> possible subsets you can construct from A. 
Since the answer can be large, you need to output the answer modulo 1000000007. Do you think you can solve this question?

Note: The greatest common divisor of an empty subset is 1. To know more about the definition of greatest common divisor, check here.

## Input

- The first line of input consists of a single integer T denoting the number of test cases. The description of T test cases follow. 
- The first line of each test case consists of a single integer N. 
- The second line of each test case consists of N space separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>

## Output

For each test case, output an single integer on a separate line denoting the answer for that test case. 
Note that you need to output all the values modulo 1000000007 (10<sup>9</sup> + 7).

## Constraints

- 1 ≤ T ≤ 30
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>5</sup>

## Example

### Input:

3

1

1

2

1 2

3

1 2 2

### Output:

1

2

8

## Explanation

### Case 1

For the first test case, N = 1, and A = [1]. There are 2 possible subsets => {}, {1} and both have a gcd of 1. Hence, the answer is 1 * 1 = 1.

### Case 2

For the second test case, N = 2, and A = [1, 2]. 
There are 4 possible subsets => {}, {1}, {2}, {1, 2}, having a gcd of 1, 1, 2 and 1 respectively. Hence, the answer is 1 * 1 * 2 * 1 = 2.

### Case 3

For the third test case, N = 3, and A = [1, 2, 2]. 
There are 8 possible subsets => {}, {1}, {2}, {2}, {1, 2}, {2, 2}, {1, 2}, {1, 2, 2}, having a gcd of 1, 1, 2, 2, 1, 2, 1, 1. 
Hence, the answer is 1 * 1 * 2 * 2 * 1 * 2 * 1 * 1 = 8.
