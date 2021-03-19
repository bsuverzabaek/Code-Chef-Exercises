T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=4 and N<=500), "N must be 4 <= N <= 500"

	S = set()

	for i in range(0,N):
		points = input().split()
		
		assert(int(points[0])>=-50 and int(points[0])<=50), "All x must be -50 <= x <= 50"
		assert(int(points[1])>=-50 and int(points[1])<=50), "All y must be -50 <= y <= 50"
		
		S.add((int(points[0]),int(points[1])))

	count = 0
	A = list(S)

	for i in range(N-1):
		for j in range(i+1,N):
			x1 = A[i][0]
			y1 = A[i][1]

			x2 = A[j][0]
			y2 = A[j][1]

			if (x1>x2):
				temp = x1
				x1 = x2
				x2 = temp

				temp = y1
				y1 = y2
				y2 = temp

			x3 = x2+(y1-y2)
			y3 = y2+(x2-x1)

			x4 = x1+(y1-y2)
			y4 = y1+(x2-x1)

			if ((x3,y3) in S and (x4,y4) in S):
				count += 1

			x3 = x2-(y1-y2)
			y3 = y2-(x2-x1)

			x4 = x1-(y1-y2)
			y4 = y1-(x2-x1)
			
			if ((x3,y3) in S and (x4,y4) in S):
				count += 1 

	print(count//4)

	T -= 1