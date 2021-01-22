T = int(input())
assert(T>=1 and T<=500), "T must be 1 <= T <= 500"

while (T>0):
	s = input()
	assert(len(s)>=2 and len(s)%2==0), "String must be at least 2 in length and be even"

	for i in range(0,len(s)):
		assert(s[i]=='A' or s[i]=='B'), "String must only have A and B characters"

	countA = 0
	countB = 0
	flag = 0

	for i in range(0,len(s)):
		if (s[i]=='A'):
			countA += 1
		else:
			countB += 1

		if (i%2!=0 and countA!=countB):
			flag = 1
			break

	if (flag==0):
		print("yes")
	else:
		print("no")

	T -= 1