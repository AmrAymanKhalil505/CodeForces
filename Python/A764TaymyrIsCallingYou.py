line = input().split(sep=" ")
n= int(line[0])
m= int(line[1])
z= int(line[2])
count = 0
for i in range(max(n,m),z+1):
    if(i %n == 0 and i%m == 0):
        count+=1
print(count)