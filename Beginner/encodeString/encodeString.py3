T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=4 and N<=100000), "N must be 4 <= N <= 10^5"

	S = input()
	assert(len(S)%4==0), "String length must be multiple of 4"

	for i in range(0,N):
		assert(S[i]=='0' or S[i]=='1'), "String must be either 0 or 1"

	i = 0
	x = ''

	while (i<len(S)):
		p = S[i:i+4]
		x += chr(97+int(p,2))
		i += 4

	print(x)

	T -= 1