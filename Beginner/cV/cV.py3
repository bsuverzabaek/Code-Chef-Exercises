T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	S = input()

	for i in range(0,N):
		assert(ord(S[i])>=97 and ord(S[i])<=122), "Each character must be lower case English letters"

	count = 0

	if (N==1):
		print(count)
	else:
		for i in range(0,N-1):
			if (S[i]!='a' or S[i]!='e' or S[i]!='i' or S[i]!='o' or S[i]!='u'):
				if (S[i+1]=='a' or S[i+1]=='e' or S[i+1]=='i' or S[i+1]=='o' or S[i+1]=='u'):
					count += 1

		print(count)

	T -= 1