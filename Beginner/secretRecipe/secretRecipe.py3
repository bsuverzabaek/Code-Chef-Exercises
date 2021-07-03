T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	X1,X2,X3,V1,V2 = map(int,input().split())

	assert(X1<=100000), "X1 must be <= 10^5"
	assert(X2<=100000), "X2 must be <= 10^5"
	assert(X3<=100000), "X3 must be <= 10^5"

	assert(X1<X3 and X3<X2), "X1 must be < X3 and X3 must be < X2"

	assert(V1>=1 and V1<=100000), "V1 must be 1 <= V1 <= 10^5"
	assert(V2>=1 and V2<=100000), "V2 must be 1 <= V2 <= 10^5"

	s1 = X3-X1
	s2 = X2-X3

	t1 = s1/V1
	t2 = s2/V2

	if (t1<t2):
		print("Chef")
	elif (t1>t2):
		print("Kefa")
	else:
		print("Draw")

	T -= 1