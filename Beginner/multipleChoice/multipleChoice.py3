T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	S = input()
	U = input()

	assert(len(S)==N and len(U)==N), "Both Strings S and U must be of length N"

	for i in range(0,N):
		assert(S[i]=='A' or S[i]=='B' or S[i]=='C' or S[i]=='D'), "String S must be made up of A, B, C, or D"
		assert(U[i]=='A' or U[i]=='B' or U[i]=='C' or U[i]=='D' or U[i]=='N'), "String U must be made up of A, B, C, D, or N"

	num = 0
	score = 0

	while (num<N):
		if (U[num]=='N'):
			num += 1
		else:
			if (S[num]==U[num]):
				score += 1
				num += 1
			else:
				num += 2

	print(score)

	T -= 1