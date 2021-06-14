T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100), "Length of S must be 1 <= |S| <= 100"

	count0 = 0
	count1 = 0

	for i in range(0,len(S)):
		if (S[i]=='1'):
			count1 += 1
		else:
			count0 += 1

	if (count0>count1):
		print("LOSE")
	else:
		print("WIN")

	T -= 1