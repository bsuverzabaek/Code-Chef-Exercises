# Project Spoon

Lo and Behold! For you may be surprised by what our chief chef Noodle has in mind for this season! 
Today, Noodle announced one of his most extra-ordinary ideas ever - Project Spoon. 

Noodle plans to deploy large spoons in the atmosphere so that people all around the world can download food 
directly from his kitchen thereby saving him a lot of overhead cost. Yes, you read that right. Large spoons suspended in the atmosphere.

Noodle decides the following strategy to implement his idea. He will deploy exactly N spoons in the country. 
Every spoon can cater to as many cities as it wants. 
The only catch is that between every pair of spoons A and B, A must cater to at-least one city that B doesn't cater to, and B must cater to at-least one 
city that A doesn't cater to.

Noodle would like to know what is the minimum number of cities a country must have for his strategy to be successful. 
Since, he is not all that good with calculation, he asks you to help him with it.

## Input

- The first line contains an integer T denoting the number of test cases. 
- Each of the next T lines contain an integer N, the number of spoons that Noodle plans to deploy in the country.

## Output

For every test case, print in a single line the number of minimum cities required.

## Constraints

- 1 ≤ T ≤ 100000
- 2 ≤ N ≤ 10<sup>18</sup>

## Example

### Input:

2

2

3

### Output:

2

3

## Explanation

### Case 1

Each spoon caters to a different city. Since there are two spoons, two cities are sufficient.

### Case 2

Again, each spoon needs to cater to one city and there are three spoons. So, three cities are required at minimum.
