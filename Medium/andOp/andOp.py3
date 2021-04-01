N = int(input())
assert(N>=2 and N<=300000), "N must be 2 <= N <= 3*10^5"

A = []

for i in range(0,N):
	ai = int(input())
	assert(ai>=0 and ai<=1000000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^9"
	A.append(ai)

max = (A[0]&A[1])

for i in range(0,N):
	if (max>A[i]):
		continue

	for j in range(i+1,N):
		temp = (A[i]&A[j])

		if (temp>max):
			max = temp

print(max)