T = int(input())
assert(T>=1 and T<=5000), "T must be 1 <= T <= 5000"

sumN = 0

while (T>0):
	N = int(input())
	sumN += N

	if (T==1):
		assert(sumN>=1 and sumN<=1000000), "Sum of N must be 1 <= sumN <= 10^6"

	chairs = input()
	count = 0
	flag = 0

	for i in range(0,N):
		if (chairs[i]=='0'):
			count += 1

		if (chairs[i]=='1'):
			flag = 1

	assert(flag==1), "There must be at least one chair occupied"
	con = 0

	for i in range(0,N):
		if (chairs[i]=='0' and chairs[(i+N-1)%N]=='1'):
			len = 1

			while (chairs[(i+1)%N]=='0'):
				len += 1
				i += 1

			con = max(con,len)

	print(count-con)

	T -= 1