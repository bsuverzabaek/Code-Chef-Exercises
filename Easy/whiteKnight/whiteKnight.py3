T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=4 and N<=1000), "N must be 4 <= N <= 1000"

	ans = [[0]*N for i in range(N)]

	for i in range(0,N):
		board = input()
		for j in range(0,N):
			if (board[j]=='.'):
				ans[i][j] = 0
			if (board[j]=='P'):
				ans[i][j] = 1
			if (board[j]=='K'):
				x = i
				y = j

	for j in range(N-2,-1,-1):
		for i in range(0,N):
			r = 0

			if (i>0 and j<N-2):
				r = max(r,ans[i-1][j+2])

			if (i>1):
				r = max(r,ans[i-2][j+1])

			if (i<N-2):
				r = max(r,ans[i+2][j+1])

			if (i<N-1 and j<N-2):
				r = max(r,ans[i+1][j+2])

			ans[i][j] += r

	print(ans[x][y])

	T -= 1