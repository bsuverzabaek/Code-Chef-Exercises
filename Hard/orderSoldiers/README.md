# Ordering the Soldiers

In Byteland it is always the military officer's main worry to order his soldiers on parade correctly. 
Luckily, ordering soldiers is not really such a problem. 
If a platoon consists of n men, all of them have different rank (from 1 - lowest to n - highest) and on parade they should be 
lined up from left to right in increasing order of rank.

Sounds simple, doesn't it? Well, Sgt Johnny thought the same, until one day he was faced with a new command. 
He soon discovered that his elite commandos preferred to do the fighting, and leave the thinking to their superiors. 
So, when at the first rollcall the soldiers lined up in fairly random order it was not 
because of their lack of discipline, but simply because they couldn't work out how to form a line in correct order of ranks. 
Sgt Johnny was not at all amused, particularly as he soon found that none of the soldiers even remembered his own rank. 
Over the years of service every soldier had only learned which of the other soldiers were his superiors. 
But Sgt Johnny was not a man to give up easily when faced with a true military challenge. 
After a moment's thought a solution of brilliant simplicity 
struck him and he issued the following order: "men, starting from the left, one by one, do: (step forward; go left until there is no 
superior to the left of you; get back in line)." 
This did indeed get the men sorted in a few minutes. The problem was solved... for the time being.

The next day, the soldiers came in exactly the same order as the day before, and had to be rearranged using the same method. 
History repeated. 
After some weeks, Sgt Johnny managed to force each of his soldiers to remember how many men he passed when going left, and thus make the 
sorting process even faster.

If you know how many positions each man has to walk to the left, can you try to find out what order of ranks the soldiers initially line up in?

## Input

- The first line of input contains an integer, the number of test cases. It is followed by t test cases, each consisting of 2 lines. 
- The first line contains a single integer n. 
- The second line contains n space separated integers w<sub>i</sub>, denoting how far the i-th soldier in line 
must walk to the left when applying Sgt Johnny's algorithm.

## Output

For each test case, output a single line consisting of n space separated integers - the ranks of the soldiers, given from left to 
right in their initial arrangement.

## Constraints

- t<=50
- 1<=n<=200000

## Example

### Input:

2

3

0 1 0

5

0 1 2 0 1

### Output:

2 1 3

3 2 1 5 4
