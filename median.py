N=int(input())
a=list(map(int,input().split()))
a.sort()
if(N%2!=0):
       print(a[N//2])
