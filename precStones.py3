while (1):
	T = int(input("Input T: "))

	if(T<=0 or T>2500):
		print("T must be 1 <= T <= 2500")
	else:
		break

for t in range(T):
	while (1):
		S = input().strip()

		if (len(S)<=0 or len(S)>100000):
			print("String S must be 1 <= len(S) <= 10^5")
		else:
			break

	N = len(S)
	A = []
	i = 0

	while (i<N):
		j = i + 1
		
		while (j<N and S[i]==S[j]):
			j += 1
		
		A.append(j-i)
		i = j

	if (len(A)>1 and S[0]==S[-1]):
		A[0] += A[-1]
		A.pop()

	B = max(A)

	if (len(A)==1):
		if (B==1):
			ans = 1
		else:
			ans = B-1
	else:
		if (B==1):
			if(len(A)==2):
				ans = 2
			else:
				ans = 3
		elif (B==2):
			if (len(A)==1):
				ans = 2
			else:
				ans = 3
		else:
			A_copy = A[:]
			A_copy.remove(B)
			B1 = max(A_copy)
			ans = max(B//2,B1)

	print("Case {}: {}".format(t+1,ans))