N=int(input())
if N<60:
     print(0,N)
else:
     a=N//60
     b=N%60
     print(a,b)
