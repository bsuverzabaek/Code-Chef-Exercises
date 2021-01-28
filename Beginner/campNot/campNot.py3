T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	D = int(input())
	assert(D>=1 and D<=31), "D must be 1 <= D <= 31"

	A = [0]*32

	while (D>0):
		d,p = map(int,input().split())

		assert(d>=1 and d<=31), "d must be 1 <= d <= 31"
		assert(p>=1 and p<=100), "p must be 1 <= p <= 100"

		A[d] = p

		D -= 1

	for i in range(1,32):
		A[i] += A[i-1]

	Q = int(input())
	assert(Q>=1 and Q<=100), "Q must be 1 <= Q <= 100"

	while (Q>0):
		dead,req = map(int,input().split())

		assert(dead>=1 and dead<=31), "deadlines must be 1 <= dead <= 31"
		assert(req>=1 and req<=5000), "requirements must be 1 <= req <= 5000"

		if (A[dead]>=req):
			print("Go Camp")
		else:
			print("Go Sleep")

		Q -= 1

	T -= 1