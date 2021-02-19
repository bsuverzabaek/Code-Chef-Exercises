N,M = map(int,input().split())
assert(N>=1 and N<=1000 and M>=1 and M<=1000), "N and M must be 1 <= N,M <= 1000"

arr = []

for i in range(0,N):
	S = input() + '0'
	temp = []

	for c in S:
		temp += [int(c)]

	arr += [temp]

arr += [[0]*(M+1)]

add = [[0 for i in range(M+1)] for j in range(N+1)]
pre1 = [[0 for i in range(M+1)] for j in range(N+1)]
pre2 = [[0 for i in range(M+1)] for j in range(N+1)]

Q = int(input())
assert(Q>=1 and Q<=1000000), "Q must be 1 <= Q <= 10^6"

while (Q>0):
	x1,y1,x2,y2 = map(int,input().split())

	x1 -= 1
	y1 -= 1
	x2 -= 1
	y2 -= 1

	pre2[x1][y1] += 1
	pre2[x2+1][y1] -= 1
	pre2[x1][y2+1] += -1
	pre2[x2+1][y2+1] -= -1

	Q -= 1

for i in range(M):
	for j in range(N):
		if (j==0):
			pre1[j][i] = pre2[j][i]
		else:
			pre1[j][i] = pre1[j-1][i]+pre2[j][i]

for i in range(N):
	for j in range(M):
		if (j==0):
			add[i][j] += pre1[i][j]
		else:
			add[i][j] = add[i][j-1]+pre1[i][j]

for i in range(N):
	for j in range(M):
		arr[i][j] += add[i][j]
		arr[i][j] %= 2

for i in range(N):
	for j in range(M):
		print(arr[i][j],end='')
	print()