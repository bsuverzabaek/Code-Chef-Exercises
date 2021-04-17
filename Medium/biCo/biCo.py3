grid = [0]*100

for i in range(0,100):
	grid[i] = [0]*50

for i in range(0,100):
	grid[i][0] = 1
	j = 1

	while (j<=i and j<50):
		if (i==j):
			grid[i][j] = 1
		else:
			grid[i][j] = grid[i-1][j-1]+grid[i-1][j]
		
		j += 1
	
T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

coins = []

while (T>0):
	R,C,G = map(int,input().split())

	assert(C>=0 and C<=49), "C must be 0 <= C <= 49"
	assert(R>=0 and R<=99), "R must be 0 <= R <= 99"
	assert(G>=1 and G<=1000000000000), "G must be 1 <= G <= 10^12"

	moves = 0

	while (G>0):
		R = C

		while (R<100 and grid[R][C]<=G):
			R += 1

		R -= 1
		G -= grid[R][C]
		coins.insert(moves,grid[R][C])
		moves += 1
		C -= 1

	print(moves)

	for i in range(0,moves):
		print(str(coins[i]) + " ",end="")
	
	print()

	T -= 1