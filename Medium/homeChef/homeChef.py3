T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N<=1000), "N must be <= 10^3"

	X = []
	Y = []

	for i in range(0,N):
		xi,yi = map(int,input().split())

		assert(xi>=-100000000 and xi<=100000000), "X["+str(i)+"] must be -10^8 <= X[i] <= 10^8"
		assert(yi>=-100000000 and yi<=100000000), "Y["+str(i)+"] must be -10^8 <= Y[i] <= 10^8"

		X.append(xi)
		Y.append(yi)

	if (N%2!=0):
		print(1)
	else:
		X.sort()
		Y.sort()

		a = X[N//2]-X[N//2-1]+1
		b = Y[N//2]-Y[N//2-1]+1

		print(a*b)

	T -= 1