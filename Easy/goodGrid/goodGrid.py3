T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,X = map(int,input().split())

	assert(N>=1 and N<=5000), "N must be 1 <= N <= 5000"
	assert(X>=1 and X<=N*N), "X must be 1 <= X <= N^2"

	flag = 0

	for i in range(1,N+1):
		if (X%i==0 and X/i<=N):
			flag = 1
			break

	if (flag==1):
		print("Yes")
	else:
		print("No")

	T -= 1