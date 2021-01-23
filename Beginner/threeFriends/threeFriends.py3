def max(a,b,c):
	if (a>b and a>c):
		return a
	elif (b>a and b>c):
		return b
	else:
		return c

T = int(input())
assert(T>=1 and T<=30), "T must be 1 <= T <= 30"

while (T>0):
	X,Y,Z = map(int,input().split())

	assert(X>=1 and X<=3), "X must be 1 <= X <= 3"
	assert(Y>=1 and Y<=3), "Y must be 1 <= Y <= 3"
	assert(Z>=1 and Z<=3), "Z must be 1 <= Z <= 3"

	if (X+Y+Z==2*max(X,Y,Z)):
		print("yes")
	else:
		print("no")

	T -= 1