T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100), "String S must be of length 1 <= S <= 100"

	for i in range(0,len(S)):
		assert((ord(S[i])>=97 and ord(S[i])<=122) or S[i]==' '), "String S must be made up of either lower case English letters or a space"

	key = "not"
	A = S.split()

	if key in A:
		print("Real Fancy")
	else:
		print("regularly fancy")

	T -= 1