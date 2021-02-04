# Workers

There are N workers; each worker is of one of the following three types:

- A *translator* translates some text from Chef's language to another langague.
- An *author* writes some text in Chef's language.
- An *author-translator* can both write a text in Chef's language and translate it to another language.

Chef wants to have some text written and translated into some language (different from Chef's language). 
Chef can't do either of those tasks, but he can hire workers. 
For each i (1≤i≤N), if he hires the i-th worker, he must pay that worker c<sub>i</sub> coins.

Help Chef find the minimum total number of coins he needs to pay to have a text written and translated. 
It is guaranteed that it is possible to write and translate a text.

## Input

- The first line of the input contains a single integer N denoting the number of workers.
- The second line contins N space-separated integers c<sub>1</sub>,c<sub>2</sub>,...,c<sub>N</sub> denoting the numbers of coins Chef has to pay each hired worker.
- The third line contains N space-separated integers t<sub>1</sub>,t<sub>2</sub>,...,t<sub>N</sub> denoting the types of workers. 
For each valid i, the i-th worker is a translator if t<sub>i</sub>=1, an author if t<sub>i</sub>=2 or an author-translator if t<sub>i</sub>=3.

## Output

Print a single line containing one integer — the minimum number of coins Chef has to pay.

## Constraints

- 1≤N≤1,000
- 1≤c<sub>i</sub>≤100,000 for each valid i
- 1≤t<sub>i</sub>≤3 for each valid i

## Example

### Input:

5   

1 3 4 6 8 

1 2 1 2 3 

### Output:

4

## Explanation

Chef can hire 2 workers: worker 1, who is a translator, and worker 2, who is an author. 
In total, he pays them 1+3=4 coins.
