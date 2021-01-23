T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(K>=0 and K<=N), "K must be 0 <= K <= N"

	s = input()
	assert(len(s)==N), "String s must be of length N"

	for i in range(0,N):
		assert((ord(s[i])>=65 and ord(s[i])<=90) or (ord(s[i])>=97 and ord(s[i])<=122)), "String s must be made of upper and lower case English letters"

	chef = 0
	bro = 0

	for i in range(0,N):
		if (ord(s[i])>=65 and ord(s[i])<=90):
			chef += 1
		else:
			bro += 1

	if (chef<=K and bro>K):
		print("chef")
	elif (bro<=K and chef>K):
		print("brother")
	elif (chef<=K and bro<=K):
		print("both")
	else:
		print("none")
	
	T -= 1