T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	S = input()

	for i in range(0,len(S)):
		assert(ord(S[i])>=65 and ord(S[i])<=90), "All letters must be upper-case latin letters"

	if (S[0]==S[1]):
		print("NO")
	else:
		flag = 0

		for i in range(0,len(S)):
			if (i%2==0):
				if (S[0]!=S[i]):
					flag = 1
					break	
			else:
				if (S[1]!=S[i]):
					flag = 1
					break

		if (flag==0):
			print("YES")
		else:
			print("NO")

	T -= 1