import math
line = input().split(sep=" ")
cups = int(line[0])+int(line[1])+int(line[2])
line = input().split(sep=" ")
medal = int(line[0])+int(line[1])+int(line[2])
n = int(input())

n -= math.ceil(cups/5.0)
n -=math.ceil(medal/10.0)

if(n>=0):
    print("YES")
else:
    print("NO")

