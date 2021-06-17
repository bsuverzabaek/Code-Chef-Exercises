T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100000), "Length of S must be 1 <= |S| <= 10^5"

	flag = 0

	for i in range(0,len(S)):
		assert(S[i]=='0' or S[i]=='1'), "Each char must be 0 or 1"

		if (S[i]=='1' and flag==0):
			flag = 1
		elif (S[i]=='1' and flag==2):
			flag = 0
			break
		elif (S[i]=='0' and flag==1):
			flag = 2

	if (flag==0):
		print("NO")
	elif (flag==1 or flag==2):
		print("YES")

	T -= 1