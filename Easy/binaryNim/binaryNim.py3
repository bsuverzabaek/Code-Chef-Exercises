T = int(input())
assert(T>=1 and T<=500), "T must be 1 <= T <= 500"

while (T>0):
	i = input().split()

	N = int(i[0])
	S = i[1]

	assert(N>=1 and N<=50), "N must be 1 <= N <= 50"
	assert(S[0]=='D'), "S must be 'Dee' or 'Dum'"
	assert(S[1]=='e' or S[1]=='u'), "S must be 'Dee' or 'Dum'"
	assert(S[2]=='e' or S[2]=='m'), "S must be 'Dee' or 'Dum'"

	dee,dum = 0,0

	while (N>0):
		B = input()

		for i in range(0,len(B)):
			assert(B[i]=='0' or B[i]=='1'), "B must be 0 or 1"

		if (B[0]=='0'):
			dee += B.count('0')
		else:
			dum += B.count('1')

		N -= 1

	if (dee>dum):
		print("Dee")
	elif (dum>dee):
		print("Dum")
	else:
		if (S=="Dee"):
			print("Dum")
		else:
			print("Dee")

	T -= 1