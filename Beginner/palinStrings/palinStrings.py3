T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	A = input()
	B = input()

	assert(len(A)>=1 and len(A)<=1000), "Length of strings must be 1 <= |A| <= 1000"
	assert(len(B)>=1 and len(B)<=1000), "Length of strings must be 1 <= |B| <= 1000"

	C1 = [0]*26
	C2 = [0]*26

	flag = 0

	for i in range(0,len(A)):
		C1[ord(A[i])-ord('a')] += 1

	for i in range(0,len(B)):
		C2[ord(B[i])-ord('a')] += 1

	for i in range(0,26):
		if (C1[i]>0 and C2[i]>0):
			flag = 1
			break

	if (flag==1):
		print("Yes")
	else:
		print("No")

	T -= 1