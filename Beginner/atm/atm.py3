while (1):
	x = int(input("Input X: "))

	if (x<=0 or x>2000):
		print("X must be 0 < X <= 2000")
	else:
		break

while (1):
	y = float(input("Input Y: "))

	if (y<0 or y>2000):
		print("Y must be 0 <= Y <= 2000")
	else:
		break

if (x%5 != 0 or y-x-0.5<0):
	print("%0.2f" % y)
else:
	print("%0.2f" % (y-x-0.5))