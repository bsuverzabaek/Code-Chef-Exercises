T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	count = [0]*6
	l = 0

	for i in range(0,N):
		S = input()
		l += len(S)

		if (i==N-1):
			assert(l<=1000), "Sum of strings' length must be at most 1000"

		for j in range(0,len(S)):
			assert(ord(S[j])>=97 and ord(S[j])<=122), "All strings must be made of lowercase English letters"

			if (S[j]=='c'):
				count[0] += 1
			elif (S[j]=='o'):
				count[1] += 1
			elif (S[j]=='d'):
				count[2] += 1
			elif (S[j]=='e'):
				count[3] += 1
			elif (S[j]=='h'):
				count[4] += 1
			elif (S[j]=='f'):
				count[5] += 1

	int(count[0]/2)
	int(count[3]/2)
	min = count[5]

	for i in range(0,6):
		if (count[i]<min):
			min = count[i]

	print(min)

	T -= 1