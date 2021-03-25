S = [0]*100009
pSum = [0]*100009
C = [0]*500000

prime = [False]*500000
freeNum = [False]*500000

prime[0] = True
prime[1] = True

for i in range(2,500001):
	if (i*i>500000):
		break
	if (not prime[i]):
		for j in range(i*i,500000,i):
			prime[j] = True

S[1] = 1

for i in range(2,100009):
	S[i] += 1
	for j in range(i,100009,i):
		S[j] += i
	
freeNum[0] = True

for i in range(2,100010):
	if (i*i>100009):
		break
	for j in range(i*i,100010,i*i):
		freeNum[j] = True

for i in range(2,500000):
	if (not prime[i]):
		for j in range(i,500000,i):
			C[j] += 1

for i in range(2,100009):
	pSum[i] = pSum[i-1]
	if (not freeNum[i] and not prime[C[S[i]]]):
		pSum[i] += S[i]

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	L,R = map(int,input().split())

	assert(L>=1 and L<=R), "L must be 1 <= L <= R"
	assert(R>=L and R<=100000), "R must be L <= R <= 10^5"

	print(pSum[R]-pSum[L-1])

	T -= 1