# Paint the Wall

Professor Sahil is a master artist, he always finds creative ways to teach lessons to his students. 
Today in Painting class he took all the students of the class to a wall. 
Professor Sahil asked every student to paint the wall upto a certain integral 
height one by one (second boy starts once the first boy finishes painting) from the bottom with any color of their wish, except a 
student Mudit who was made to stand behind the wall and note down all the data i.e the height upto which each 
student painted and the color C<sub>i</sub> every student used. 
At the end of the painting session Professor asked Mudit to tell how many distinct colors are there on the wall. 
Mudit being a weak student asked you for help.

Formally, given a wall of infinite height, initially unpainted. 
There occur N operations, and in ith operation, the wall is painted upto height H<sub>i</sub> with color C<sub>i</sub>. 
Suppose in j<sup>th</sup> operation (j>i) wall is painted upto height H<sub>j</sub> with color C<sub>j</sub> such 
that H<sub>j</sub>>= H<sub>i</sub>, the C<sub>i</sub>th color on the wall is hidden. 
At the end of N operations, you have to find the number of distinct colors(>=1) visible on the wall.

Help him find out the number of distinct colors on the wall.

## Input

- The first line consists of single integer T denoting the number of test cases.
- The second line contains 2 space separated integers N and M, denoting the number of students and number of colors available (1 to M).
- The third line contains N-space separated integers (H<sub>i</sub>) denoting the height upto which each student painted the wall.
- The fourth line contains N space separated integers denoting the color ( C<sub>i</sub> ) the i<sup>th</sup> student used.

## Output

Print the number for distinct colors on the wall for each test case.

## Constraints

- 1≤T≤100
- 1≤N,M≤10<sup>5</sup>
- Sum of N over all test cases <= 5*10<sup>5</sup>
- Sum of M over all test cases <=5*10<sup>5</sup>
- 1≤H<sub>i</sub>≤10<sup>9</sup>
- 1≤C<sub>i</sub>≤M

## Example

### Input:

3

5 4

1 2 3 4 5

3 3 3 3 3

5 4

3 5 1 2 3

1 2 3 4 3

5 5 

5 4 3 2 3

1 2 3 4 5

### Output:

1

2

3

## Explanation

### Case 1

In the first test case, painted upto height 1, 2, 3, 4, 5 in the five operations, all with the same color. 
Hence, the number of distinct colors is 1.
