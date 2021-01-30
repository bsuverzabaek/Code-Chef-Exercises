T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N,K,x,y = map(int,input().split())

	assert(N>=2 and N<=1000000000), "N must be 2 <= N <= 10^9"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	if(x==y):
		X = N
		Y = N
	else:
		if(x>y):
			if (K%4==1):
				X = N
				Y = N - x + y
			elif (K%4==2):
				X = N - x + y
				Y = N
			elif (K%4==0):
				X = x - y
				Y = 0
			else:
				X = 0
				Y = x- y
		else:
			if (K%4==1):
				X = N + x - y
				Y = N
			elif (K%4==2):
				X = N
				Y = N + x - y
			elif (K%4==0):
				X = 0
				Y = y - x
			else:
				X = y - x
				Y = 0

	print(str(X) + " " + str(Y))

	T -= 1