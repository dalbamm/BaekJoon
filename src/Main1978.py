def isPrime(n):
    if n==1 : return 0
    elif n==2 : return 2

    for i in range(2, (int)(n/2)+1 ):
        if n%i == 0:
            return 0
    return n

N=int(input())
numlist=map(int, input().split())
cnt = 0
for i in numlist:
    if(isPrime(i) != 0):
        cnt += 1
print(cnt)

'''N = int(input())
rst = ""
cnt = 0
num = 2
while(cnt != N):
    if findPrime(num) != 0:
        rst += " {}".format(num)
        cnt += 1
    num += 1
print(rst[1:])
'''
