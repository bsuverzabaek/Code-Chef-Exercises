T = int(input())
assert(T>=1 and T<=200), "T must be 1 <= T <= 200"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

	S = input()
	assert(len(S)==N), "String S must be of length N"

	for i in range(0,N):
		assert(ord(S[i])>=97 and ord(S[i])<=122), "All letters must be lower case"

	count = [0]*26

	for i in range(0,N):
		count[ord(S[i])-97] += 1

	flag = 0

	for i in range(0,N):
		if (count[i]%2!=0):
			flag = 1
			break

	if (flag==1):
		print("NO")
	else:
		print("YES")

	T -= 1