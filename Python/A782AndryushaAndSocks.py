import array
n = int(input())
line = input().split(" ")
table = [0]*(n+1)
count = 0
maxCount = 0
for x in line:
    if(table[int(x)]!=1):
        table[int(x)] += 1
        count += 1
        maxCount = max(maxCount,count)
    else:
        count-=1

print(maxCount)