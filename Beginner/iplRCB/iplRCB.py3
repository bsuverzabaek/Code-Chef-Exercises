T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

while (T>0):
	X,Y = map(int,input().split())

	assert(X>=1 and X<=100), "X must be 1 <= X <= 100"
	assert(Y>=1 and Y<=100), "Y must be 1 <= Y <= 100"
	assert(X>=1 and X<=2*Y), "X must be 1 <= X <= 2*Y"

	if (X>Y):
		print(X-Y)
	elif (X<=Y):
		print(0)

	T -= 1