# Enter your code here. Read input from STDIN. Print output to STDOUT

from math import factorial

t=int(raw_input())

for x in range(0,t):
	sum=0
	myfact=factorial(int(raw_input()))
	strmyfact=str(myfact)
	mylen=len(str(myfact))
	for y in range(0,mylen):
		sum+=(int)(strmyfact[y])
	print sum