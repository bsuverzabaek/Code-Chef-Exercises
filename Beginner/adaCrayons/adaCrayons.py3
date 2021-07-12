T = int(input())
assert(T>=1 and T<=3000), "T must be 1 <= T <= 3000"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=50), "Length of S must be 1 <= |S| <= 50"

	countU = 0
	countD = 0

	for i in range(0,len(S)-1):
		if (S[i]=='D' and S[i+1]=='U'):
			countD += 1
		elif (S[i]=='U' and S[i+1]=='D'):
			countU += 1

	if (S[len(S)-1]=='D'):
		countD += 1
	else:
		countU += 1

	if (countU<countD):
		print(countU)
	else:
		print(countD)

	T -= 1