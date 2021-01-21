T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):

	A,B = map(int,input().split())
	assert(A>=1 and A<=1000 and B>=1 and B<=1000), "A and B must be 1 <= A,B <= 1000"

	for i in range(1,5000):
		if (i%2==0):
			B -= i
			if (B<0):
				print("Limak")
				break
		else:
			A -= i
			if (A<0):
				print("Bob")
				break

	T -= 1