T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=20000), "N must be 1 <= N <= 2*10^4"

	X = (list(map(int,input().split())))[:N]
	Y = (list(map(int,input().split())))[:N]

	a = 0
	b = 0

	for i in range(0,N):
		assert(X[i]>=1 and X[i]<=100000), "X["+str(i)+"] must be 1 <= X[i] <= 10^5"

	for i in range(0,N):
		assert(Y[i]>=1 and Y[i]<=100000), "Y["+str(i)+"] must be 1 <= Y[i] <= 10^5"

		if (i%2==0):
			a += X[i]
			b += Y[i]
		else:
			a += Y[i]
			b += X[i]

	if (a<b):
		print(a)
	else:
		print(b)

	T -= 1