import math
line = input().split(sep=" ")
start = int(line[0])
fav = int(line[1])
inc= int(line[2])
if(fav == start):
    print("YES")
elif( inc == 0 ):
    print("NO")
else:
    bool = (fav-start % inc)==0
    x = math.ceil((fav-start) / inc)
    if(start + inc*x) == fav:
        if((start > fav and inc <0) or (start < fav and inc >0) ):
            print("YES")
        else:
            print("NO")
    else:
        print("NO")


# if (start < fav and inc > 0 ):
#     if((fav-start)%inc == 0 ):
#         print("YES")
#     else:
#         print("NO")
#
# elif (start > fav and inc < 0 ):
#
# elif (start = fav and inc = 0 ):
# else :
#     print("NO")

