T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	X,Y = map(int,input().split())

	assert(X>=0 and X<=1000000000), "X must be 0 <= X <= 10^9"
	assert(Y>=0 and Y<=1000000000), "Y must be 0 <= Y <= 10^9"

	if (X==0):
		print(Y)
	elif (Y==0):
		print(X)
	else:
		if (Y<X):
			temp = Y
			Y = X
			X = temp
		
		while (Y%X!=0):
			temp = Y%X
			Y = X
			X = temp
		
		print(2*X)

	T -= 1