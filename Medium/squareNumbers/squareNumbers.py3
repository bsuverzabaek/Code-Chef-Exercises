import math

def gcd(a,b):
	while (b!=0):
		mod = a%b
		a = b
		b = mod

	return a

T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^18"

	foundAns = 0
	ans = -1

	for i in range(0,N-1):
		for j in range(i+1,N):
			g = gcd(A[i],A[j])

			if (g>1):
				ans = g
				foundAns = 1
				break

		if (foundAns!=0):
			break

	for i in range(0,N):
		x = 1

		while ((x*x*x)<=A[i]):
			if (x>1 and A[i]%(x*x)==0):
				ans = x
				foundAns = 1
				break
			
			if (A[i]%x==0):
				div = A[i]//x
				s = math.sqrt(div) + 1E-6

				if (s>1 and (s*s)==div):
					ans = s
					foundAns = 1
					break

			x += 1

		if (foundAns!=0):
			break

	print(ans)

	T -= 1