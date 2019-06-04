N=int(input())
if(N>=1 and N<=1000):
         a=list(map(int,input().split()))
         t=sorted(a)
         print(*t)
