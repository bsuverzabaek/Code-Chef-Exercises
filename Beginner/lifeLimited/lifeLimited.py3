T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	s1 = input()
	s2 = input()
	s3 = input()

	logo = [s1,s2,s3]
	flag = 0

	for i in range(0,2):
		for j in range(0,2):
			if (logo[i][j]=='l'):
				if (logo[i+1][j]=='l'):
					if (logo[i+1][j+1]=='l'):
						flag = 1
						print("yes")
						break
		if (flag==1):
			break

	if (flag==0):
		print("no")

	T -= 1