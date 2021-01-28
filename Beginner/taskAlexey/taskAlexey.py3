def gcd(A,B):
	if (A==0):
		return B
	elif (B==0):
		return A
	else:
		rem = A%B
		A = B
		B = rem
		return gcd(A,B)

def lcm(A,B):
	gcf = gcd(A,B)

	if (A%gcf==0):
		ans = int(A/gcf)
		ans *= B
		return ans
	else:
		ans = int(B/gcf)
		ans *= A
		return ans

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=500), "N must be 2 <= N <= 500"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

	min = 1000000000

	for i in range(0,N):
		for j in range(i+1,N):
			if (int(A[i]*A[j]/gcd(A[i],A[j]))<min):
				min = int(A[i]*A[j]/gcd(A[i],A[j]))

	print(min)

	T -= 1