T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"
sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	sumN += N

	if (T==1):
		assert(sumN<=100000), "Sum of N over test cases must be <=10^5"

	S = input()
	P = input()
	count = 0

	for i in range(0,N):
		assert(S[i]=='0' or S[i]=='1'), "String S must only have 0 or 1"
		assert(P[i]=='0' or P[i]=='1'), "String P must only have 0 or 1"

		if (S[i]!=P[i]):
			if (S[i]=='1'):
				count += 1
			else:
				count -= 1

		if (count<0):
			break

	if (count==0):
		print("Yes")
	else:
		print("No")

	T -= 1