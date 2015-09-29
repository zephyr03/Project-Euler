# Enter your code here. Read input from STDIN. Print output to STDOUT
import inflect
p=inflect.engine()

t=int(raw_input())
for i in range(0,t):
    print p.number_to_words(long(raw_input()))