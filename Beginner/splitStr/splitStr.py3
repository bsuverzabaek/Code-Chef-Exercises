T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10^4"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"

	S = input()
	assert(len(S)==N), "Length of S must be == N"

	sumN += N

	for i in range(0,N):
		assert(ord(S[i])>=97 and ord(S[i])<=122), "All letters must be lowercase"

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <= 10^6"

	c = 0

	for i in range(0,N-1):
		if (S[i]==S[N-1]):
			c += 1
			break

	if (c>0):
		print("YES")
	else:
		print("NO")

	T -= 1