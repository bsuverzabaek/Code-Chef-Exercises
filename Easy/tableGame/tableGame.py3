T = int(input())
sum = 0

while (T>0):
	M = input()
	N = input()
	Q = int(input())

	sum += len(M)+len(N)+Q

	assert(len(M)>=1 and len(M)<=100000), "M must be 1 <= M <= 10^5"
	assert(len(N)>=1 and len(N)<=100000), "N must be 1 <= N <= 10^5"
	assert(Q>=1 and Q<=100000), "Q must be 1 <= Q <= 10^5"
	assert(sum<=1000000), "Sum of N+M+Q must be <= 10^6"

	query1 = []
	query2 = []

	X = 0
	Y = 0

	for i in range(0,Q):
		q1,q2 = map(int,input().split())

		assert(q1>=1 and q1<=len(N)), "X must be 1 <= X <= N"
		assert(q2>=1 and q2<=len(M)), "Y must be 1 <= Y <= M"

		query1.append(q1)
		query2.append(q2)

		if (q1>X):
			X = query1[i]
		

		if (q2>Y):
			Y = query2[i]

	row1 = [0]*(Y+1)
	col1 = [0]*(X+1)
	row2 = [0]*(Y+1)
	col2 = [0]*(X+1)

	if (M[0]=='0' or N[0]=='0'):
		row1[1] = 1
		col1[1] = 1
	else:
		row1[1] = 0
		col1[1] = 0

	for i in range(2,Y+1):
		if (row1[i-1]==1 and M[i-1]=='1'):
			row1[i] = 0
		else:
			row1[i] = 1

	for i in range(2,X+1):
		if (col1[i-1]==1 and N[i-1]=='1'):
			col1[i] = 0
		else:
			col1[i] = 1

	if (X>1):
		row2[1] = col1[2]

		for i in range(2,Y+1):
			if (row1[i]==1 and row2[i-1]==1):
				row2[i] = 0
			else:
				row2[i] = 1

	if (Y>1):
		col2[1] = row1[2]

		for i in range(2,X+1):
			if (col1[i]==1 and col2[i-1]==1):
				col2[i] = 0
			else:
				col2[i] = 1

	for i in range(0,Q):
		X = query1[i]
		Y = query2[i]

		if (X==1):
			print(row1[Y],end='')
		elif (Y==1):
			print(col1[X],end='')
		elif (Y>X):
			print(row2[Y-X+2],end='')
		else:
			print(col2[X-Y+2],end='')

	print()

	T -= 1