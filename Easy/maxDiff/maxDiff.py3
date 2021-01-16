import sys

def max(a,b):
	if (a>b):
		return a
	else:
		return b

while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		N,K = map(int,input().split())

		if (K<=0 or K>=N):
			print("K must be 1 <= K < N")
		elif (N<=K or N>100):
			print("N must be K < N <= 100")
		else:
			break

	W = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		if (W[i]<=0 or W[i]>100000):
			print("W["+str(i)+"] must be 1 <= W[i] <= 10^5")
			sys.exit(0)
				
	W.sort()
	sum = 0
	S1 = 0
	S2 = 0

	for i in range(0,N):
		sum += W[i]

	for i in range(0,K):
		S1 += W[i]

	for i in range(N-1,N-K-1,-1):
		S2 += W[i]

	print(max(abs(S1-(sum-S1)),abs(S2-(sum-S2))))

	T -= 1