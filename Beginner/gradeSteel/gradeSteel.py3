T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	hard,carbon,tensile = map(float,input().split())

	assert(hard>=0 and hard<=10000), "Hardness must be 1 <= hardness <= 10000"
	assert(carbon>=0 and carbon<=10000), "Carbon content must be 1 <= carbon <= 10000"
	assert(tensile>=0 and tensile<=10000), "Tensile strength must be 1 <= tensile <= 10000"

	if (hard>50 and carbon<0.7 and tensile>5600):
		print(10)
	elif (hard>50 and carbon<0.7):
		print(9)
	elif (carbon<0.7 and tensile>5600):
		print(8)
	elif (hard>50 and tensile>5600):
		print(7)
	elif (hard>50 or carbon<0.7 or tensile>5600):
		print(6)
	else:
		print(5)

	T -= 1