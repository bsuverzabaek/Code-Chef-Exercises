S = int(input())
assert(S>=1 and S<=100), "S must be 1 <= S <= 100"

while (S>0):
	N = int(input())
	assert(N>=3 and N<=100), "N must be 3 <= N <= 100"

	if (N%2==0):
		H = (list(map(int,input().split())))[:N]

		for i in range(0,N):
			assert(H[i]>=1 and H[i]<=100), "H["+str(i)+"] must be 1 <= H[i] <= 100"

		print("no")
	else:
		H = (list(map(int,input().split())))[:N]

		for i in range(0,N):
			assert(H[i]>=1 and H[i]<=100), "H["+str(i)+"] must be 1 <= H[i] <= 100"

		flag = 0

		for i in range(0,N//2):
			if (H[i+1]-H[i]==1):
				flag = 1
			else:
				flag = 0
				break
			
		count = 0

		for i in range(0,N//2):
			if (H[i]==H[N-i-1]):
				count += 1
			
		if (flag==1 and count==N//2 and H[0]==1):
			print("yes")
		else:
			print("no")

	S -= 1