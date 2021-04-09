T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=10), "N must be 1 <= N <= 10"
	assert(M>=0 and M<=20), "M must be 0 <= M <= 20"

	A = [0]*(N+1)

	for i in range(0,M):
		x,y = map(int,input().split())

		A[x] += 1
		A[y] += 1

	count = 0

	if (M<2):
		print("YES")
	elif (M==2):
		for i in range(1,N+1):
			if (A[i]==2):
				count += 1

		if (count==1):
			print("YES")
		else:
			print("NO")
	else:
		print("NO")

	T -= 1