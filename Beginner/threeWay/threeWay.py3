def dist(x1,y1,x2,y2):
	return ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2))

while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		R = int(input())

		if(R<=0 or R>1000):
			print("R must be 1 <= R <= 1000")
		else:
			break

	x = []
	y = []

	for i in range(0,3):
		while (1):
			xi,yi = map(int,input().split())

			if (xi<-10000 or xi>10000 or yi<-10000 or yi>10000):
				print("x1 and y1 must be -10000 <= x1,y1 <= 10000")
			else:
				x.append(xi)
				y.append(yi)
				break

	pair = 0

	for i in range(0,2):
		if(dist(x[i],y[i],x[i+1],y[i+1])<=R*R):
			pair += 1

	if (pair>1):
		print("yes")
	else:
		print("no")
				
	T -= 1		