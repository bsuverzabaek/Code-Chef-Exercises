T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,X = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(X<=1000000), "X must be <= 1000000"

	S = input()
	max = X
	min = X

	for i in range(0,N):
		assert(S[i]=='L' or S[i]=='R'), "S must be only 'L' or 'R'"

		if (S[i]=='R'):
			X += 1

			if (X>max):
				max = X
			
			if (X<min):
				min = X

		if (S[i]=='L'):
			X -= 1

			if (X>max):
				max = X
			
			if (X<min):
				min = X

	print((max-min)+1)

	T -= 1