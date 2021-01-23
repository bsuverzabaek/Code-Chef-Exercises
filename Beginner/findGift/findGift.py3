T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

	S = input()
	assert(len(S)==N), "String S must have length N"

	for i in range(0,N):
		assert(S[i]=='L' or S[i]=='R' or S[i]=='U' or S[i]=='D'), "String S must be made of L,R,U,D"

	x = 0
	y = 0
	prev = S[0]

	for i in range(0,N):
		if (i==0):
			if (S[i]=='R'):
				x += 1
			elif (S[i]=='L'):
				x -= 1
			elif (S[i]=='U'):
				y += 1
			elif (S[i]=='D'):
				y -= 1
		else:
			if (prev=='U' and (S[i]=='U' or S[i]=='D')):
				prev = S[i]
			elif (prev=='D' and (S[i]=='U' or S[i]=='D')):
				prev = S[i]
			elif (prev=='L' and (S[i]=='L' or S[i]=='R')):
				prev = S[i]
			elif (prev=='R' and (S[i]=='L' or S[i]=='R')):
				prev = S[i]
			elif (prev=='U' and (S[i]!='U' and S[i]!='D')):
				if (S[i]=='R'):
					prev = S[i]
					x += 1
				else:
					prev = S[i]
					x -= 1
			elif (prev=='D' and (S[i]!='U' and S[i]!='D')):
				if (S[i]=='R'):
					prev = S[i]
					x += 1
				else:
					prev = S[i]
					x -= 1
			elif (prev=='L' and (S[i]!='L' and S[i]!='R')):
				if (S[i]=='U'):
					prev = S[i]
					y += 1
				else:
					prev = S[i]
					y -= 1
			elif (prev=='R' and (S[i]!='L' and S[i]!='R')):
				if (S[i]=='U'):
					prev = S[i]
					y += 1
				else:
					prev = S[i]
					y -= 1

	print(str(x) + " " + str(y))
				
	T -= 1