line = input().split(sep= " " )
n = int(line[0])
m = int(line[1])
tel = []

for i in range(n):
    line = input().split(sep= " " )
    tel.append((int(line[0]),int(line[1])))


tel = sorted(tel, key=lambda tup: tup[0])

is_there = False
cur_point = 0
if(m==cur_point):
    is_there = True
for i in range (len(tel)):
    # print(cur_point,tel[0][0],tel[0][1],sep=" ")
    if (cur_point >= tel[i][0] and cur_point <= tel[i][1]):
        cur_point = tel[i][1]

        if(cur_point >= m):
            is_there= True
            break
    elif( cur_point > tel[i][1]):
        continue
    else:
        break
if(is_there):
    print("YES")
else:
    print("NO")
