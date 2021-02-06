T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	M,W = input().split()

	assert(len(M)>=1 and len(M)<=25000), "M must be 1 <= |M| <= 25000"
	assert(len(W)>=1 and len(W)<=25000), "W must be 1 <= |W| <= 25000"

	for i in range(0,len(M)):
		assert(ord(M[i])>=97 and ord(M[i])<=122), "M must only have lower case letters"

	for i in range(0,len(W)):
		assert(ord(W[i])>=97 and ord(W[i])<=122), "W must only have lower case letters"

	i = 0
	j = 0
	k = 0

	while (i<len(W) and j<len(M)):
		if (M[j]==W[i]):
			j += 1
		i += 1

	i = 0

	while (i<len(M) and k<len(W)):
		if (W[k]==M[i]):
			k += 1
		i += 1

	if (j==len(M)):
		print("YES")
	elif (k==len(W)):
		print("YES")
	else:
		print("NO")

	T -= 1