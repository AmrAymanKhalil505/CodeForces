def take(x=0,y=0,turn = 0):
    total = 220
    taken_x =0
    if(turn == 0):
        while(x>0 and taken_x<2 and total>=100 ):
            total-=100
            x-=1
            taken_x+=1
        while(y>0 and total>0 ):
            y-=1
            total-=10
        return (x,y,1-turn)
    else:
        while (y > 0 and total > 0):
            y -= 1
            total -= 10
        while (x > 0 and taken_x < 2 and total >= 100):
            total -= 100
            x -= 1
            taken_x += 1
        return (x, y, turn,total)
line = input().split(" ")
x = int (line[0])
y = int (line[1])
turn = 0
total=0
if(x > 2 and y >24):
    x=x%2
    y=y%24
while((x * 100 + y * 10) > 220):
    x,y,turn,total = take(x,y,turn)
    if(total>0):
        break
    else:
        turn=1-turn
if(turn == 0 ):
    print("Hanako")
else:
    print("Ciel")