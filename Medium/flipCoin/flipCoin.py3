def flipFunc(coins,A,B):
	for i in range(A,B+1):
		if (coins[i]==0):
			coins[i] = 1
		else:
			coins[i] = 0

def countFunc(coins,A,B):
	count = 0

	for i in range(A,B+1):
		if (coins[i]==1):
			count += 1

	return count

while (1):
	N,Q = map(int,input().split())

	if (N<=0 or N>100000):
		print("N must be 1 <= N <= 100000")
	elif (Q<=0 or Q>100000):
		print("Q must be 1 <= Q <= 100000")
	else:
		break

coins = []

for i in range(0,N):
	coins.insert(i,0)

while (Q>0):

	while (1):
		num,A,B = map(int,input().split())

		if (num<0 or num>1):
			print("The first number must be 0 or 1")
		elif (A<0 or A>B):
			print("A must be 0 <= A <= B")
		elif (B<A or B>N-1):
			print("B must be A <= B <= N-1")
		else:
			break

	if (num==0):
		flipFunc(coins,A,B)
	else:
		print(countFunc(coins,A,B))

	Q -= 1