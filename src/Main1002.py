import math as m
def getdist(numlist):
    xdiff=numlist[3]-numlist[0]
    ydiff=numlist[4]-numlist[1]
   # print(m.sqrt(xdiff*xdiff + ydiff*ydiff))
    return m.sqrt(xdiff*xdiff + ydiff*ydiff)

def circleCase(numlist):
    x1=numlist[0]
    y1=numlist[1]
    r1=numlist[2]
    x2=numlist[3]
    y2=numlist[4]
    r2=numlist[5]
    d = getdist(numlist)
    rdiff = abs(r1-r2)
    radd = r1+r2
    if x1==x2 and y1==y2 and r1==r2:
        return -1
    elif rdiff==d:
        return 1
    elif rdiff<d and d<radd:
        return 2
    elif radd == d:
        return 1
    else:
        return 0

N=int(input())
tmp = N
while(tmp!=0):
    tmp-=1
    cnt = 0
    numlist = input().split()
    for i in numlist:
        numlist[cnt]=int(numlist[cnt])
        cnt+=1

    print("{}".format(circleCase(numlist)))

