R = int(input())
assert(R>=1 and R<=1000000000), "R must be 1 <= R <= 10^9"

if (R>=1 and R<=50):
	print(100)
elif (R>=51 and R<=100):
	print(50)
else:
	print(0)