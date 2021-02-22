T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100), "Length of S must be 1 <= S <= 100"

	eCount = 0;
	iCount = 0;
	lCount = 0;
	mCount = 0;
	tCount = 0;

	for i in range(0,len(S)):
		if (S[i]=='E'):
			eCount += 1
		
		if (S[i]=='I'):
			iCount += 1
		
		if (S[i]=='L'):
			lCount += 1

		if (S[i]=='M'):
			mCount += 1
		
		if (S[i]=='T'):
			tCount += 1

	if (len(S)<9):
		print("NO")
	elif (len(S)==9):
		if (eCount>=1 and iCount>=2 and lCount>=2 and mCount>=2 and tCount>=2):
			print("YES")
	else:
		if(eCount>=2 and iCount>=2 and lCount>=2 and mCount>=2 and tCount>=2):
			print("YES")

	T -= 1