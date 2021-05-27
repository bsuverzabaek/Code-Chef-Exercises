T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=50), "Length of string must be 1 <= |S| <= 50"

	a = [0]*26
	max = 0

	if (len(S)%2==1):
		print("NO")
	else:
		for i in range(0,len(S)):
			if (ord(S[i])>=ord('a') and ord(S[i])<=ord('z')):
				a[ord(S[i])-ord('a')] += 1

		for i in range(0,26):
			if (max<a[i]): 
				max = a[i]

		if (max==len(S)//2):
			print("YES")
		else:
			print("NO")

	T -= 1