from math import sqrt

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	A,M = map(int,input().split())

	assert(M>=2 and M<=10000000000), "M must be 2 <= M <= 10^10"
	assert(A>=1 and A<M), "A must be 1 <= A < M"

	f = {1}

	for i in range(2,int(sqrt(M))+1):
		if (M%i==0):
			f.add(i)
			f.add(M//i)

	total = 0
	l = []

	for i in f:
		p = M-i

		if (p%A==0):
			q = p//A

			if (q%i==0):
				l.append(q)
				total += 1

	print(total)

	if (total>0):
		l.sort()
		print(*l,end='')
		print('')
	else:
		print('')

	T -= 1