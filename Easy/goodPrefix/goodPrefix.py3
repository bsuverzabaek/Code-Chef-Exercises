T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	S = input()
	K,X = map(int,input().split())

	for i in range(0,len(S)):
		assert(ord(S[i])>=97 and ord(S[i])<=122), "String S must only have lower case letters"

	assert(K>=0 and K<=10000), "K must be 0 <= K <= 10000"
	assert(X>=1 and X<=10000), "X must be 1 <= X <= 10000"

	count = 0
	F = [0]*26

	for i in range(0,len(S)):
		F[ord(S[i])-97] += 1

		if (F[ord(S[i])-97]>X):
			if (K>0):
				F[ord(S[i])-97] -= 1
				K -= 1
			else:
				break
		else:
			count += 1

	print(count)

	T -= 1