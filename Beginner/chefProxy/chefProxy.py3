T = int(input())
assert(T>=1 and T<=200), "T must be 1 <= T <= 200"

while (T>0):
	D = int(input())
	assert(D>=1 and D<=1000), "D must be 1 <= D <= 1000"

	S = input()
	assert(len(S)==D), "String S must be length D"

	for i in range(0,D):
		assert(S[i]=='A' or S[i]=='P'), "String S must be only A or P"

	count = 0
	proxy = 0
	flag = 0

	for i in range(0,D):
		if (S[i]=='P'):
			count += 1

	if (count>=int((75*D+99)/100)):
		print(proxy)
	else:
		for i in range(2,D-2):
			if((S[i-2]=='P' or S[i-1]=='P') and (S[i+1]=='P' or S[i+2]=='P') and S[i]=='A'):
				count += 1
				proxy += 1

				if (count>=int((75*D+99)/100)):
					flag = 1
					print(proxy)
					break

		if (flag==0):
			print("-1")

	T -= 1