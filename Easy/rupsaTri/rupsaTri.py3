P = [False]*5000001
Q = [False]*5000001

j = 2

for i in range(2,2237):
	if (P[i]==True):
		continue

	while (i*j<5000001):
		P[i*j] = True
		j += 1

j = 1

for i in range(2,5000001):
	if (P[i]==True):
		continue

	if ((i-1)%4==0):
		while (i*j<5000001):
			Q[i*j] = True
			j += 1

T = int(input())
assert(T>=1 and T<=1000000), "T must be 1 <= T <= 10^6"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=5000000), "N must be 1 <= N <= 5*10^6"

	if (Q[N]==True):
		print("YES")
	else:
		print("NO")

	T -= 1