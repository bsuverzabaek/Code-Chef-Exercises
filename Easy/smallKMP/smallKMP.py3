T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	S = input()
	P = input()

	A = [0]*26
	B = [0]*26

	for i in range(0,len(S)):
		assert(ord(S[i])>=97 and ord(S[i])<=122), "All letters must be lower case"
		x = ord(S[i])-97
		A[x] += 1

	k = ord(P[0])-97

	for i in range(0,len(P)):
		assert(ord(P[i])>=97 and ord(P[i])<=122), "All letters must be lower case"
		x = ord(P[i])-97
		B[x] += 1

	for i in range(0,26):
		A[i] -= B[i]

	for i in range(0,k):
		for j in range(0,A[i]):
			print(chr(i+97),end='')

	for i in range(1,len(P)):
		if (P[0]>P[i]):
			flag = 1
			break

		if (P[0]<P[i]):
			flag = 0
			break

	if (flag==1):
		print(P,end='')
		for i in range(k,26):
			for j in range(0,A[i]):
				print(chr(i+97),end='')

	if (flag==0):
		for j in range(0,A[k]):
			print(chr(k+97),end='')
		print(P,end='')
		for i in range(k+1,26):
			for j in range(0,A[i]):
				print(chr(i+97),end='')

	print()

	T -= 1